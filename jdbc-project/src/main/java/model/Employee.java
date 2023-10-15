package model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private int age;
    //private int officeId;
    private Office office;

    //private int passportId;
    private Passport passport;

    private Timestamp updatedTs;
    private Timestamp createdTs;

    private Employee reportsTO;

}
