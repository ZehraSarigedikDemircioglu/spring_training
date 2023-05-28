package com.cydeo.dto;

import com.cydeo.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) // if we put a different field in postman, it will not throw error, but also ignore the field (like exception handling)
public class UserDTO {

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // I wanna get this if the field be not serialized, not going to db
    private String password;
    private String username;
    private UserRole role;

    @JsonManagedReference  // This field is going to be serialized, will show
    private AccountDTO account;

}
