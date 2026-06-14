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
class Mochila {
    private List<Comida> comida;
    private int capacidad;

    public Mochila() {
        this.comida = new ArrayList<>(); 
        this.capacidad = 3;             
        }

    public List<Comida> getComida() {
        return comida;
    }

    public void setComida(List<Comida> comida) {
        this.comida = comida;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public int getCantidadActual() {
        return this.comida.size();
    }
    
    public void ampliarCapacidad() {
            this.capacidad++; 
            System.out.println("La capacidad actual ampliada es de: "+capacidad);
        }
    
    public boolean guardarComida(Comida comida){
        if (comida == null){
            return false;
        }
        
        if (this.comida.size() >= this.capacidad) {
            System.out.println("Error: La mochila está llena. No se puede guardar " + comida.getNombre());
            return false; 
        }
        
        return this.comida.add(comida); 
    }
        
    }
    
    
    
    


