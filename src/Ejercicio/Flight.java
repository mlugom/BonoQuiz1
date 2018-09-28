/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Equipo de Trabajo
 */
public class Flight {
    private int fligtNo;
    private Airport start;
    private Airport destination;

    public Flight(int fligtNo, Airport start, Airport destination) {
        this.fligtNo = fligtNo;
        this.start = start;
        this.destination = destination;
    }

    public int getFligtNo() {
        return fligtNo;
    }

    public Airport getStart() {
        return start;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setFligtNo(int fligtNo) {
        this.fligtNo = fligtNo;
    }

    public void setStart(Airport start) {
        this.start = start;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }
    
}
