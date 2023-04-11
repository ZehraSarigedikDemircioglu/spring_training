package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    // display all regions in Canada
    // select * from regions where country = Canada
    List<Region> findByCountry(String country);
}
