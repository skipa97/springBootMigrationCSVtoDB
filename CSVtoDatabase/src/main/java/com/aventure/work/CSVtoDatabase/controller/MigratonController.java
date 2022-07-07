package com.aventure.work.CSVtoDatabase.controller;

import com.aventure.work.CSVtoDatabase.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MigratonController {

    @Autowired
    private CustomerService cs;

    @RequestMapping(path="/start")
    private void setDataToDB() {
        cs.saveData();
    }

}
