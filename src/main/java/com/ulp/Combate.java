/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
class Combate {
    private Heroe heroe;
    private Personaje enemigo;
    private int turno;

    public Combate(Heroe heroe, Personaje enemigo) {
        this.heroe = heroe;
        this.enemigo = enemigo;
    }
    
    

    public Combate(Heroe heroe, Personaje enemigo, int turno) {
        this.heroe = heroe;
        this.enemigo = enemigo;
        this.turno = 1;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

    public Personaje getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Personaje enemigo) {
        this.enemigo = enemigo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    //METODO NO DESARROLLADO
    public void pelearPorTurnos(){
        
    }
    
    
    
}
