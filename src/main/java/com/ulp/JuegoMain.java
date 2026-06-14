/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ulp;

import java.util.ArrayList;

/**
 *
 * @author xiana
 */
public class JuegoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("        INICIANDO EL JUEGO         ");
        System.out.println("==================================================");

        //ESPACIO Y UBICACIONES
        Ubicacion origen = new Ubicacion(0, 0);
        Ubicacion zonaEnemigos = new Ubicacion(5, 5);
        Ubicacion zonaJefe = new Ubicacion(10, 10);
        
        // CREO EL ENEMIGO FINAL
        EnemigoFinal jefeFinal = new EnemigoFinal(zonaJefe, "Sauron");
        
        //CREO EL HEROE
        Heroe heroe = new Heroe(origen, "Legolas el Elfo");

        // CREO EL ARMA
        Arma arcoLargo = new Arma(origen, "Arco", 20);
        
        // CARGO EL ARMA
        Proyectil flecha1 = new Proyectil("Flecha de hierro");
        Proyectil flecha2 = new Proyectil("Flecha de hierro");
        arcoLargo.cargarProyectil(flecha1);
        arcoLargo.cargarProyectil(flecha2);

        // DOY EL ARMA AL HEROE
        heroe.setArma(arcoLargo);

        // CREO ARRY DE ENEMIGOS Y LA INSTANCIA DE ETAPA QUE LA VA A CONTENER
        ArrayList<EnemigoComun> listaVacia = new ArrayList<>();
        Etapa etapa1 = new Etapa(1, "Bosque Oscuro", jefeFinal, listaVacia, 0);

        //USO MI METODO DE AGREGAR ENEMIGOS PARA GRAFICAR LA AGREGACION
        etapa1.agregarEnemigoComun(new EnemigoComun(zonaEnemigos, "Goblin Escurridizo"));
        etapa1.agregarEnemigoComun(new EnemigoComun(zonaEnemigos, "Orco de Vanguardia"));


        // METODO PRINCIPAL DEL JUEGO
        etapa1.jugarEtapa(heroe);

        // ESTADO FINAL
        System.out.println("               FINAL DE LA BATALLA             ");
        System.out.println("==================================================");
        System.out.println("Heroe: " + heroe.getNombre() + " - Sigue vivo?: " + (heroe.sigueVivo() ? "Si (Vida: " + heroe.getVidas() + ")" : "NO"));
        System.out.println("Jefe Final: " + jefeFinal.getNombre() + " - Sigue vivo?: " + (jefeFinal.sigueVivo() ? "Si (Vida: " + jefeFinal.getVidas() + ")" : "NO (Derrotado)"));
        System.out.println("==================================================");
    }
  
    }
    

