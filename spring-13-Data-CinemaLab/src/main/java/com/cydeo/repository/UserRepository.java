package com.cydeo.repository;

import com.cydeo.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount, Long> {
}
