/*
package com.vadim.FuelCalulator;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FuelCalulatorApplication.class);
	}

}

  public String getPriceFuelOnGasStation() throws IOException {
        Document doc = Jsoup.connect("https://index.minfin.com.ua/ua/markets/fuel/reg/rovenskaya/").get();
        HashMap<String, Double> fuelPrice = new HashMap<>();
        List<GasStation> gasStations = new ArrayList<>();
        String name = "";
        int i = 0;
        for (Element table : doc.select("table.zebra")) {
            for (Element row : table.select("tr")) {
                Elements tds = row.select("td");
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

                    if(tds.get(2).text().isBlank()){
                        fuelPrice.put("A-95 Plus", 0.0 );
                    } else {
                        fuelPrice.put("A-95 Plus", Double.parseDouble(tds.get(2).text().replace(",", ".")));
                    }
                    if(tds.get(3).text().isBlank()){
                        fuelPrice.put("A-95", 0.0 );
                    } else {
                        fuelPrice.put("A-95", Double.parseDouble(tds.get(3).text().replace(",", ".")));
                    }
                    if(tds.get(4).text().isBlank()){
                        fuelPrice.put("A-92", 0.0 );
                    } else {
                        fuelPrice.put("A-92 ", Double.parseDouble(tds.get(4).text().replace(",", ".")));
                    }
                    if(tds.get(5).text().isBlank()){
                        fuelPrice.put("DP", 0.0 );
                    } else {
                        fuelPrice.put("DP", Double.parseDouble(tds.get(5).text().replace(",", ".")));
                    }
                    if(tds.get(6).text().isBlank()){
                        fuelPrice.put("Gas", 0.0 );
                    } else {
                        fuelPrice.put("Gas", Double.parseDouble(tds.get(6).text().replace(",", ".")));
                    }

                }

                gasStations.add(new GasStation());
                gasStations.get(i).setFuelPrice(new HashMap<String, Double>(fuelPrice));
                gasStations.get(i).setName(name);
                i++;
                fuelPrice.clear();
            }

        }
        gasStations.remove(0);
        return gasStations.toString();
    }


    public String getAveragePriceFuel() throws IOException {
        Document doc = Jsoup.connect("https://index.minfin.com.ua/ua/markets/fuel/reg/rovenskaya/").get();
        HashMap<String, Double> fuelPrice = new HashMap<>();
        String str = "";

        for (Element table : doc.select("table.line")) {
            for (Element row : table.select("tr")) {
                Elements tds = row.select("td");
                if (tds.size() > 1) {
                    fuelPrice.put((tds.get(0).text()), Double.parseDouble(tds.get(1).text().replace(",", ".")));
                }
            }
            str = fuelPrice.toString();
            str = str.replace("Газ автомобільний", "Gas").replace("Бензин А-92", "A-92").replace("Бензин А-95 преміум", "A-95 Plus").replace("Дизельне паливо", "DP").replace("Бензин А-95", "A-95");

        }
        return str;
    }





*/
