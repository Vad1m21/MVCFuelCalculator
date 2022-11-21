package com.vadim.FuelCalculator.Repository;

import com.vadim.FuelCalculator.Entity.GasStation;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class GasStationDAO extends GenericDAO<GasStation,Long> {

    @Override
    public Class<GasStation> getEntityClass() {
        return GasStation.class;
    }
}
