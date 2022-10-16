package com.example.FirstCollaborationProject.CricketerManagementSystem.services;

import com.example.FirstCollaborationProject.CricketerManagementSystem.DAO.ConnectionImplementation;
import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.CricketerList;
import com.example.FirstCollaborationProject.CricketerManagementSystem.entities.Cricketers;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class CricketerImplementation implements CricketerServices {
    @Override
    public List<CricketerList> fetchIDAndName() {
        Connection connection = ConnectionImplementation.getConnection();
        List<CricketerList> cricketerLists = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from  Cricketer");
            while (resultSet.next()) {
                CricketerList cricketerList = new CricketerList();
                cricketerList.setCricketerID(resultSet.getInt(1));
                cricketerList.setCricketerName(resultSet.getString(2));
                cricketerLists.add(cricketerList);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return cricketerLists;
    }

    @Override
    public Cricketers fetchAllDetails(int cricketerID) {
        Connection connection = ConnectionImplementation.getConnection();
        List<Cricketers> cricketerLists = new ArrayList<>();
        Cricketers cricketers = null;


        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = null;
            resultSet = statement.executeQuery("select * from Cricketer where cricketerID="+cricketerID);
            while (resultSet.next()) {
                     cricketers=new Cricketers();
                cricketers.setCricketerID(resultSet.getInt(1));
                cricketers.setCricketerName(resultSet.getString(2));
                cricketers.setCricketerCountry(resultSet.getString(3));
                cricketers.setCricketerType(resultSet.getString(4));
                cricketers.setCricketerExperience(resultSet.getString(5));
                cricketers.setCricketerClub(resultSet.getString(6));


                cricketerLists.add(cricketers);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cricketers;
    }
}