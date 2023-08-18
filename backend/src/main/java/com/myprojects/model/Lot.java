package com.myprojects.model;

import java.util.List;

public class Lot extends BaseModel {
    private int id;
    private String name;
    private String address;
    private List<Floor> floors;
}
