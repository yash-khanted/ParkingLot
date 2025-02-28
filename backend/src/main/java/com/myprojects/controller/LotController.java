package com.myprojects.controller;

import com.myprojects.data.LotCreationObject;
import com.myprojects.model.Lot;
import com.myprojects.service.LotService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

public class LotController {
    LotService lotService;

    public LotController(){
        lotService = new LotService();
    }
    public LotCreationObject CreateLot(JSONObject requestData){
        Lot lot = lotService.createLot(
                requestData.
        );

        LotCreationObject responseData = new LotCreationObject();
        responseData.setId(lot.getId());
        responseData.setName(lot.getName());
        responseData.setAddress(lot.getAddress());
    }
}
