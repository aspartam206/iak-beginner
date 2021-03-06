package com.wicaku.iak;

/**
 * Created by Mochammad Rizki on 11/6/2016.
 */

public class Person {

    //name and address string
    private String name;
    private String address;
    private String gender;

    public Person() {
      /*Blank default constructor essential for Firebase*/
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
