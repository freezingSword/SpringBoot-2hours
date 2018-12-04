package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value={"/hello"},method= RequestMethod.GET)
    public String say(){
        return "hello,you!!!";
    }
    @RequestMapping(value={"/hi"},method= RequestMethod.GET)
    public String say1(){
        return "hi,you!!!";
    }
    @Value("${name}")
      private String name;

    @ConfigurationProperties(prefix="girl")
    @Component
    public class GirlProperties {

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}