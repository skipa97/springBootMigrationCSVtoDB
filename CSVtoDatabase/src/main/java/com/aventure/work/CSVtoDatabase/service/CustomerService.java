package com.aventure.work.CSVtoDatabase.service;


import com.aventure.work.CSVtoDatabase.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CustomerService {
    @Autowired
    private Customer customer;

    private String line = "";
    public void saveData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Documents\\SalesCustomer.csv"));
            while((line=br.readLine())!=null){
                String [] data = line.split(",");
                Customer c = new Customer();

                c.setCustomerID(Integer.parseInt(data[0]));
                c.setPersonID(Integer.parseInt(data[1]));
                c.setStoreID(Integer.parseInt(data[2]));
                c.setTerritoryID(Integer.parseInt(data[3]));
                c.setAccountNumber(data[4]);
                c.setRowguid(data[5]);
                c.setModifiedDate(data[6]);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
