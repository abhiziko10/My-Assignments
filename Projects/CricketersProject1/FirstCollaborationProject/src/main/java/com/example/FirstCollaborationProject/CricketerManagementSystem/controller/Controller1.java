package com.example.FirstCollaborationProject.CricketerManagementSystem.controller;

import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.CricketerList;
import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.Cricketers;
import com.example.FirstCollaborationProject.CricketerManagementSystem.services.CricketerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller1 {
    @Autowired
    CricketerServices cricketerServices;
    public Controller1()
    {
        System.out.println("Controller");
    }

    @GetMapping("/fetchIDAndName")
    public List<CricketerList> fetchIDAndName(){
        return cricketerServices.fetchIDAndName();
    }
    @GetMapping("/fetchAllDetails/{cricketerID}")
    public Cricketers fetchAllDetails(@PathVariable String cricketerID){
        return cricketerServices.fetchAllDetails(Integer.parseInt(cricketerID));
    }
}
