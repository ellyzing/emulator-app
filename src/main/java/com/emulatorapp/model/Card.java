package com.springboot.emulatorapp.model;
public class Card {

    private Integer id;
    private String name;
    private String number;
    private String CVV;
    private String exdate;
    private Integer money;
 //   private String pin;

    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getNum() {
        return number;
    }
 
    public void setNum(String number) {
        this.number= number;
    }
 
    public String getCVV() {
        return CVV;
    }
 
    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    public String getExdate() {
        return exdate;
    }
 
    public void setExdate(String exdate) {
        this.exdate = exdate;
    }
    public Integer getMoney() {
        return money;
    }
 
    public void setMoney(Integer money) {
        this.money = money;
    }
 }