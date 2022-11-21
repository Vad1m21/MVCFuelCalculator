package com.vadim.FuelCalculator.Web;

import com.vadim.FuelCalculator.Entity.Fuel;
import com.vadim.FuelCalculator.Entity.GasStation;
import com.vadim.FuelCalculator.Repository.GasStationDAO;
import com.vadim.FuelCalculator.Service.ServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller

public class CalculatorController {

    @RequestMapping("/")
    public String showStartPage(Model model) throws IOException {
        GasStationDAO gasStationDAO = new GasStationDAO();
        List<GasStation> stations = new GetFuel().getPriceFuelOnGasStation();
        for(GasStation gasStation1: stations){
            new ServiceFactory().getGasStationService().saveOrUpdate(gasStation1);
        }
        stations.clear();
        stations =  new ServiceFactory().getGasStationService().findAll();
        model.addAttribute("allStations" ,stations);
        return "Start-page-fuel-prices";
    }

    @RequestMapping("/calculator")
    public String showCalculatePage(Model model) {
        model.addAttribute("fuel", new Fuel());
        return "start-page-calculator";
    }

    @RequestMapping("/calculations")
    public String showCalculations(@ModelAttribute("fuel") Fuel fuel) {
        fuel.setSum((int) (fuel.getDistance() / 100 * fuel.getLiters() * fuel.getPrice() / fuel.getPeoples()));
        return "calculate";

    }
}

