package com.vadim.FuelCalculator.Service;

import com.vadim.FuelCalculator.Entity.GasStation;
import com.vadim.FuelCalculator.Repository.GasStationDAO;
import org.springframework.stereotype.Service;

@Service
public class ServiceFactory {

    public GasStationService getGasStationService(){
        return  new GasStationService(new GasStationDAO());
    }


}
