package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.Entity;
import java.util.List;


@RestController

public class GirlController {

    @Autowired
    private GirlRep girlRep;


    @RequestMapping(value="/girls",method= RequestMethod.GET)
    public List<Girl> getGirlList(){
        return girlRep.findAll();
    }


    @RequestMapping(value = "/girls",method = RequestMethod.POST)
    public Girl addGirl(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRep.save(girl);
    }


    public GirlRep getGirlRep() {
        return girlRep;
    }
}
