package com.myprojects.model;

import lombok.Data;

import java.util.List;

@Data
public class Lot extends BaseModel {
    private int id;
    private String name;
    private String address;
    private List<Floor> floors;
}
