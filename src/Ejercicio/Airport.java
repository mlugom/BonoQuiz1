/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Manuel Lugo
 */
public class Airport {
    private String name;
    private String location;
    private int runwayCount;

    public Airport(String name, String location) {
        this.name = name;
        this.location = location;
        this.runwayCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRunwayCount() {
        return runwayCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRunwayCount(int runwayCount) {
        this.runwayCount = runwayCount;
    }
    
}
