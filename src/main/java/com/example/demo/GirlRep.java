package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GirlRep extends JpaRepository<Girl,Integer> {

}