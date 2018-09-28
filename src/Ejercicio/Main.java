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
public class Main {
    public static void main(String[] args) {
        Airline avianca = new Airline("Avianca");
        avianca.anadirVuelo(new Flight(1,new Airport("Eldorado","Bogota"),new Airport("Jose_Maria_Cordoba","Medellin")));
        avianca.anadirVuelo(new Flight(2,new Airport("Jose_Maria_Cordoba","Medellin"),new Airport("Alfonso_Bonilla_Aragon","Cali")));
        avianca.anadirVuelo(new Flight(3,new Airport("Eldorado","Bogota"),new Airport("Alfonso_Bonilla_Aragon","Cali")));
        
        System.out.println("Vuelos: ");
        for(int i = 0; i <= avianca.listarVuelos().size()-1; i++){
            System.out.println("Vuelo No. " + avianca.listarVuelos().get(i).getFligtNo());
            System.out.println("Origen:");
            System.out.println(avianca.listarVuelos().get(i).getStart().getName());
            System.out.println("Destino:");
            System.out.println(avianca.listarVuelos().get(i).getDestination().getName());
        }
        System.out.println(avianca.listarVuelos().size());
    }
    
}
