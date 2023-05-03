package org.example;

import org.example.houseservice.HouseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }

        List<House> listHouse = (List<House>) context.getBean("listHouse");
        System.out.println("listHouse size:" + listHouse.size());
        for (House h : listHouse) {
            System.out.println("listHouse: data: " + h.data);
        }
        ArrayList<House> arrayHouse = (ArrayList<House>) context.getBean("arrayHouse");
        System.out.println("arrayHouse size :" + arrayHouse.size());
        for (House h : arrayHouse) {
            System.out.println("arrayHouse: data: " + h.data);
        }

        HouseService houseService = (HouseService) context.getBean("houseService");
        houseService.runProcess();

    }
}
