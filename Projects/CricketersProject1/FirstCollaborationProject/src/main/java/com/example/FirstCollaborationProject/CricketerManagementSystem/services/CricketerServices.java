package com.example.FirstCollaborationProject.CricketerManagementSystem.services;

import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.CricketerList;
import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.Cricketers;

import java.util.List;



public interface CricketerServices {
    public List<CricketerList> fetchIDAndName();

    public Cricketers fetchAllDetails(int cricketerID );
}
