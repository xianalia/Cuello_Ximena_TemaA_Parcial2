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
public class Etapa {
    private int numero;
    private String nombre;
    private EnemigoFinal enemigoFinal;
    private List<EnemigoComun> enemigosComunes;
    private int enemigoActual;

    public Etapa(int numero, String nombre, EnemigoFinal enemigoFinal, ArrayList<EnemigoComun> enemigosComunes, int enemigoActual) {
        this.numero = numero;
        this.nombre = nombre;
        this.enemigoFinal = enemigoFinal;
        if (enemigosComunes != null) {
            this.enemigosComunes = enemigosComunes;
        } else{
            this.enemigosComunes = new ArrayList<>();
        }
        this.enemigoActual = enemigoActual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EnemigoFinal getEnemigoFinal() {
        return enemigoFinal;
    }

    public void setEnemigoFinal(EnemigoFinal enemigoFinal) {
        this.enemigoFinal = enemigoFinal;
    }

    public List<EnemigoComun> getEnemigosComunes() {
        return enemigosComunes;
    }

    public void setEnemigosComunes(List<EnemigoComun> enemigosComunes) {
        this.enemigosComunes = enemigosComunes;
    }

    public int getEnemigoActual() {
        return enemigoActual;
    }

    public void setEnemigoActual(int enemigoActual) {
        this.enemigoActual = enemigoActual;
    }
    
    public void jugarEtapa(Heroe heroe) {
        System.out.println(" JUGARAS LA ETAPA " + this.numero + ": " + this.nombre.toUpperCase());
        System.out.println("-------------");

        
        while (this.enemigoActual < this.enemigosComunes.size() && heroe.sigueVivo()) {
            
            EnemigoComun enemigoDeTurno = this.enemigosComunes.get(this.enemigoActual);
            
            System.out.println("\n[AVANCE] El heroe avanza por el mapa...");
            System.out.println("Debes luchar contra " + enemigoDeTurno.getNombre() + "!");
            System.out.println("(Enemigo comun " + (this.enemigoActual + 1) + " de " + this.enemigosComunes.size() + ")");

            Combate pelea = new Combate(heroe, enemigoDeTurno,1);
            pelea.pelearPorTurnos(); // Pelean


            if (heroe.sigueVivo()) {
                System.out.println("Derrotaste a un esbirro, adelante!");
                this.enemigoActual++;
            } else {
                System.out.println("El heroe murio en combate frente a los esbirros.");
            }
        }

        if (heroe.sigueVivo()) {
            System.out.println(" Derrotaste a todos los esbirros. Ahora viene el jefe de la etapa");
            System.out.println(" Enfrentas a: " + this.enemigoFinal.getNombre());

            Combate peleaFinalDeEtapa = new Combate(heroe, this.enemigoFinal);
            peleaFinalDeEtapa.pelearPorTurnos();

            if (!this.enemigoFinal.sigueVivo() && heroe.sigueVivo()) {
                System.out.println(" ¡Victoria! Derrotaste al jefe y completaste la etapa " + this.numero);
            }
        } else {
            System.out.println("\n[GAME OVER] Morista " + this.numero + ".");
        }
    }
    
    //ACÀ SE VE LA AGREGACION (AGREGO ENEMIGOS COMUNES A MI LISTA DE ENEMIGOS A DERROTAR ANTES DEL JEFE)
    public void agregarEnemigoComun(EnemigoComun enemigo) {
        if (enemigo != null) {
            this.enemigosComunes.add(enemigo);
        }
    }
    
    
    
    
}
