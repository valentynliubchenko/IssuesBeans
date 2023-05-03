package org.example.houseservice;

import org.example.House;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class HouseService {
    private final House house;
    private final List<House> listHouse;
    private final ArrayList<House> arrayHouse;

    public HouseService(House house, List<House> listHouse, ArrayList<House> arrayHouse) {
        this.house = house;
        this.listHouse = listHouse;
        this.arrayHouse = arrayHouse;
        System.out.println("HouseService: house : " + house.data);
        System.out.println("HouseService: listHouse size : " + listHouse.size());
        for (House h : listHouse){
            System.out.println("HouseService: h.data: " + h.data);
        }
        System.out.println("HouseService: arrayHouse size : " + arrayHouse.size());
        for (House ah : arrayHouse){
            System.out.println("HouseService: ah.data: " + ah.data);
        }


    }

    public void runProcess()
    {
        System.out.println("runProcess listHouse size:" + listHouse.size());
        for (House h : listHouse) {
            System.out.println("runProcess listHouse: data: " + h.data);
        }
        System.out.println("runProcess arrayHouse size :" + arrayHouse.size());
        for (House h : arrayHouse) {
            System.out.println("runProcess arrayHouse: data: " + h.data);
        }
    }
}
