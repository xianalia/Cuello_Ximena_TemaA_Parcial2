/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xiana
 */
public class Arma extends ObjetoMovil {
    private String nombre;
    private List<Proyectil> proyectiles; 
    private int potencia;
//    private double cadencia;    
//    private int velocidad;       
//    private boolean potenciador;  
//    ESTAN EN LA CONSIGNA PERO NO LOS USE    

   
    public Arma(Ubicacion ubicacion, String nombre, int potencia) {
        super(ubicacion);
        this.nombre = nombre;
        this.potencia = potencia;
        this.proyectiles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    //PARA TENER OTRO EJEMPLO DE AGREACIÒN
    //ESTE METODO ME PERMITE AGREGAR PROYECTILES AL ARRAYLIST
    public void cargarProyectil(Proyectil proy) {
        if (proy != null) {
            this.proyectiles.add(proy);
            System.out.println("Agregaste proyectil a tu arma" + this.nombre);
        }
    }

}