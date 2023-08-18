package com.myprojects.model;

import java.util.List;

public class Floor extends BaseModel{
    private int id;
    private Status floorStatus;
    private List<Gate> gates;
    private List<Slot> slots;
}
