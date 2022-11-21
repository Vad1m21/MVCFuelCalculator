package com.vadim.FuelCalculator.Web;

import com.vadim.FuelCalculator.Entity.GasStation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Component("getFuel")
public class GetFuel {

    public List<GasStation> getPriceFuelOnGasStation() throws IOException {
        Document doc = Jsoup.connect("https://index.minfin.com.ua/ua/markets/fuel/reg/rovenskaya/").get();
        List<GasStation> gasStations = new ArrayList<>();
        String name = "";
        int i = 0;
       Long j = 0l;
        for (Element table : doc.select("table.zebra")) {
            for (Element row : table.select("tr")) {
                Elements tds = row.select("td");
                GasStation station =new GasStation();
                if (tds.size() > 1) {

                    name = tds.get(0).text();

                    if(name.equals("Авіас")){
                        name = "Avias";
                    } else if(name.equals("ОККО")){
                        name = "OKKO";
                    } else if(name.equals("Олас")){
                        name = "Olas";
                    } else if(name.equals("Укр-Петроль")){
                        name = "Ukr-Petrol";
                    } else if(name.equals("Укрнафта")){
                        name = "Ukrnafta";
                    }
                        station.setName(name);
                    if(tds.get(2).text().isBlank()){
                        station.setA95Plus(0.0);
                    } else {
                        station.setA95Plus(Double.parseDouble(tds.get(2).text().replace(",", ".")));
                    }
                    if(tds.get(3).text().isBlank()){
                        station.setA95(0.0);
                    } else {
                        station.setA95(Double.parseDouble(tds.get(3).text().replace(",", ".")));
                    }
                    if(tds.get(4).text().isBlank()){
                        station.setA92(0.0);
                    } else {
                        station.setA92(Double.parseDouble(tds.get(4).text().replace(",", ".")));
                    }
                    if(tds.get(5).text().isBlank()){

                        station.setDp(0.0);
                    } else {
                        station.setDp(Double.parseDouble(tds.get(5).text().replace(",", ".")));
                    }
                    if(tds.get(6).text().isBlank()){
                        station.setGas(0.0);
                    } else {
                        station.setGas(Double.parseDouble(tds.get(6).text().replace(",", ".")));
                    }

                }
                station.setId(j);
                gasStations.add(station);
               j++;
                           }

        }
        gasStations.remove(0);
        return gasStations;
    }
}
