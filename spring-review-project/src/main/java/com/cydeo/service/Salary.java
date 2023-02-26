package com.cydeo.service;


import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Salary {

    private final EmployeeRepository employeeRepository;
    private final HoursRepository hoursRepository;

    public Salary(EmployeeRepository employeeRepository, @Qualifier("REGULAR") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());
    }
}
