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
import java.util.ArrayList;
public class Airline {
    private String name;
    private ArrayList<Flight> offeredFlights;
    private ArrayList<Airport> usedAirports;

    public Airline(String name) {
        this.name = name;
        this.offeredFlights = new ArrayList<>();
        this.usedAirports = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Flight> getOfferedFlights() {
        return offeredFlights;
    }

    public ArrayList<Airport> getUsedAirports() {
        return usedAirports;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfferedFlights(ArrayList<Flight> offeredFlights) {
        this.offeredFlights = offeredFlights;
    }

    public void setUsedAirports(ArrayList<Airport> usedAirports) {
        this.usedAirports = usedAirports;
    }
    
    public void anadirVuelo(Flight vuelo){
        this.offeredFlights.add(vuelo);
        for(int i = 0; i < this.usedAirports.size(); i++){
            if(this.usedAirports.get(i).getName().equals(vuelo.getStart().getName())){
                this.usedAirports.get(i).setRunwayCount(this.usedAirports.get(i).getRunwayCount()+1);
            }else{
                this.usedAirports.add(vuelo.getStart());
                this.usedAirports.get(i).setRunwayCount(1);
            }
        }
    }
    
    public ArrayList<Flight> listarVuelos(){
        return this.offeredFlights;
    }
    
    public Airport getAeropuertoConMasVuelos(){
        int comparador = 0;
        int indice = 0;
        for(int i = 0; i < this.usedAirports.size(); i++){
            if(this.usedAirports.get(i).getRunwayCount() > comparador){
                comparador = this.usedAirports.get(i).getRunwayCount();
                indice = i;
            }
        }
        for(int i = 0; i <= this.usedAirports.size()-1; i++){
            if(indice == i){
                return this.usedAirports.get(i);
            }
        }
        return null;
    }
}
