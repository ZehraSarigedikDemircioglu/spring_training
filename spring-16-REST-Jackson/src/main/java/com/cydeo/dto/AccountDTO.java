package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"age", "city"}, ignoreUnknown = true)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDTO {

    // @JsonInclude(JsonInclude.Include.NON_NULL) if we have null values, will exclude properties
    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;

    @JsonBackReference  // This field is not going to be serialized, will hide in the db
    private UserDTO user;

}
