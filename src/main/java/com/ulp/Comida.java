/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
public class Comida extends ObjetoMovil {
    private String nombre;
    private int valorCuracion;
    private int usos;

    public Comida(Ubicacion ubicacion, String nombre, int valorCuracion, int usos ) {
        super(ubicacion);
        this.nombre = nombre;
        this.valorCuracion = valorCuracion;
        this.usos = usos;
    }

    public String getNombre() {
        return nombre;
    }
    

    public int getValorCuracion() {
        return valorCuracion;
    }

    public void setValorCuracion(int valorCuracion) {
        this.valorCuracion = valorCuracion;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }
    
    public int alimentar(){
        if (this.usos > 0){
            this.usos--;
            return valorCuracion;
        }
        System.out.println("Esta comida ya no alimenta");
        return 0;
    }


    
}
