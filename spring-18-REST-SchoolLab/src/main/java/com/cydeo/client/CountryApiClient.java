package com.cydeo.client;

import com.cydeo.dto.country.CountryDTO;
import com.cydeo.dto.weather.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://restcountries.com/v3.1", name = "COUNTRY-CLIENT")
public interface CountryApiClient {
    // https://restcountries.com/v3.1/name/deutschland
    @GetMapping("/name/{countryName}")
    List<CountryDTO> getCountryInfo(@PathVariable(value = "countryName") String countryName);
}
