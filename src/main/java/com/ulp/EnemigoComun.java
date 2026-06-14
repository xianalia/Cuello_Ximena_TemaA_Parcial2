/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
public class EnemigoComun extends Personaje {

    public EnemigoComun(Ubicacion ubicacion, String nombre) {
        super(ubicacion, nombre, 50, 10); // 50 de vida inicial fija
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getCapacidadOfensiva() {
        return capacidadOfensiva;
    }

    public void setCapacidadOfensiva(int capacidadOfensiva) {
        this.capacidadOfensiva = capacidadOfensiva;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
}
