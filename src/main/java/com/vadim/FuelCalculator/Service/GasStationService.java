package com.vadim.FuelCalculator.Service;

import com.vadim.FuelCalculator.Entity.GasStation;
import com.vadim.FuelCalculator.Repository.GasStationDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GasStationService {
        private final GasStationDAO gasStationDAO;

       public void create(GasStation gasStation){
            gasStationDAO.save(gasStation);
        }

        public void update(GasStation gasStation , Long id){
            gasStationDAO.update(gasStation,id);
        }

        public void saveOrUpdate(GasStation gasStation){
           gasStationDAO.saveOrUpdate(gasStation);
        }
        public List<GasStation> findAll(){
            return gasStationDAO.findAll();
        }

        public void delete(Long id){ gasStationDAO.delete(id); }

        public Optional<GasStation> findById(Long id){ return gasStationDAO.findById(id);}


    }

