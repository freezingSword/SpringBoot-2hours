package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GirlRep extends JpaRepository<Girl,Integer> {

}