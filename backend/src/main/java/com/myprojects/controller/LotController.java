package com.myprojects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/v1/api/lot")
public class LotController {
    @PostMapping(path = "/create")
    public int CreateLot(){
        return 0;
    }
}
