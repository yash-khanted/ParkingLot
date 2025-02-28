package com.myprojects.service;

import com.myprojects.model.Lot;

import java.sql.Date;

public class LotService {
    public Lot createLot(String lotName, String address, int noOfFloors){
        Lot lot = new Lot();
        lot.setName(lotName);
        lot.setAddress(address);

        List<Floor> floor
        lot.setFloors();
        return lot;
    }
}
