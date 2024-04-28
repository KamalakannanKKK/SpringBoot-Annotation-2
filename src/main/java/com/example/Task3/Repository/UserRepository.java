package com.example.Task3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.Task3.Component.UserComponent;

@Repository
public interface UserRepository extends JpaRepository<UserComponent,Integer>{

}
