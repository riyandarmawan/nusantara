/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Riyan
 */
public class District {
    int id, regency_id;
    String name;

    public District() {
    }

    public District(int id, int regency_id, String name) {
        this.id = id;
        this.regency_id = regency_id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegency_id() {
        return regency_id;
    }

    public void setRegency_id(int regency_id) {
        this.regency_id = regency_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
