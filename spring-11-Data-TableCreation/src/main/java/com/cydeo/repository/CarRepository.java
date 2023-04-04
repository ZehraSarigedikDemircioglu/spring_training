package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository // Spring boot creates impl for us. So, we put annotation interface level. After some version, this is not needed. We can ignore this annotation too.
public interface CarRepository extends JpaRepository<Car, Long> {
}
