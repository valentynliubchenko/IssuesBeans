package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class HouseConfiguration {

    @Bean("listHouse")
    public List<House> getListHouse() {
        List<House> listHouses= new ArrayList<>();
        listHouses.add(new House());
        listHouses.add(new House());
        listHouses.add(new House());
        listHouses.get(0).data = 10;
        listHouses.get(1).data = 20;
        listHouses.get(2).data = 30;
        return listHouses;
    }

    @Bean("arrayHouse")
    public ArrayList<House> getArrayHouse() {
        ArrayList<House> arrayHouses= new ArrayList<>();
        arrayHouses.add(new House());
        arrayHouses.add(new House());
        arrayHouses.add(new House());
        arrayHouses.get(0).data = 100;
        arrayHouses.get(1).data = 200;
        arrayHouses.get(2).data = 300;
        return arrayHouses;
    }


    @Bean("house")
    public House getHouse() {
        House house = new House();
        house.data = 1;
        return house;
    }


}
