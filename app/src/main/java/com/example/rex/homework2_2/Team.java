package com.example.rex.homework2_2;

/**
 * Created by REX on 2015/3/21.
 */
public class Team {
    private int id;
    private int logo;
    private String name;

    Team(){

    }

    Team(int id,int logo,String name){
        this.setId(id);
        this.setLogo(logo);
        this.setName(name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
