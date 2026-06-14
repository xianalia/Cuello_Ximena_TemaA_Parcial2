/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
    public class Heroe extends Personaje {
        private Mochila mochila;
        private Armadura armadura;
        
        public Heroe(Ubicacion ubicacion, String nombre) {

            super(ubicacion, nombre, 100, 20); // 100 de vida inicial fija
            this.mochila = new Mochila();
            this.armadura = new Armadura();
        }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
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
    
    public void curarVida(Comida comida){
        if (comida == null){
            throw new NullPointerException("No hay comida");
        }
        
        this.setVidas(this.getVidas()+comida.getValorCuracion());
    }

     
        
    }
