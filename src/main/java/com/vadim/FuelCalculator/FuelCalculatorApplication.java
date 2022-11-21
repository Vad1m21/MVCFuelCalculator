package com.vadim.FuelCalculator;


import com.vadim.FuelCalculator.Entity.GasStation;
import com.vadim.FuelCalculator.Repository.GasStationDAO;
import com.vadim.FuelCalculator.Service.ServiceFactory;
import com.vadim.FuelCalculator.Web.GetFuel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class FuelCalculatorApplication {

	public static void main(String[] args) throws IOException {

//SpringApplication.run(FuelCalculatorApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		GasStation gasStation = context.getBean("gasStation", GasStation.class);
		GetFuel get = context.getBean("getFuel",GetFuel.class);

new ServiceFactory().getGasStationService().delete(15l);
		new ServiceFactory().getGasStationService().delete(16l);
		new ServiceFactory().getGasStationService().delete(17l);
		new ServiceFactory().getGasStationService().delete(18l);
		new ServiceFactory().getGasStationService().delete(  19l);
		new ServiceFactory().getGasStationService().delete(20l);
		new ServiceFactory().getGasStationService().delete(21l);
		new ServiceFactory().getGasStationService().delete(22l);
		new ServiceFactory().getGasStationService().delete(23l);
		new ServiceFactory().getGasStationService().delete(24l);
		new ServiceFactory().getGasStationService().delete(25l);
		new ServiceFactory().getGasStationService().delete(26l);
		new ServiceFactory().getGasStationService().delete(27l);
		new ServiceFactory().getGasStationService().delete(28l);
		System.out.println(get.getPriceFuelOnGasStation());
		List<GasStation> stations = get.getPriceFuelOnGasStation();

		for(GasStation gasStation1: stations){
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println(gasStation1.toString());
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------");
			//new ServiceFactory().getGasStationService().saveOrUpdate(gasStation1);
				new GasStationDAO().save(gasStation1);
		}
		context.close();
	}



}
