package com.carpooling.restapi.carpooling_api.daoOrRepository;

import com.carpooling.restapi.carpooling_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
