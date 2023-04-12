package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {

    // Display all regions in Canada
    // select * from regions where country = Canada
    // select = find, read, query, count, or get
    // by = where
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country); // it is same with findByCountry query

    // Display all regions with country name includes 'United'
    List<Region> findByCountryContains(String country);

    // Display all regions with country name includes 'United' in order(region)

    List<Region> findByCountryContainsOrderByRegion(String country);

    // Display top 2 regions in United States
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);
}
