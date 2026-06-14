/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ulp;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class PlantillaTp5Junit {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("        INICIANDO SIMULADOR DE RPG (TEST)         ");
        System.out.println("==================================================");

        // 1. CONFIGURACIÓN DEL ESPACIO Y UBICACIONES
        // Suponiendo que tu clase Ubicacion tiene un constructor Ubicacion(int x, int y)
        Ubicacion origen = new Ubicacion(0, 0);
        Ubicacion zonaEnemigos = new Ubicacion(5, 5);
        Ubicacion zonaJefe = new Ubicacion(10, 10);

        // 2. CREACIÓN DEL PROTAGONISTA (HÉROE)
        // Nace automáticamente con 100 de vida inicial según el constructor que diseñamos
        Heroe heroe = new Heroe(origen, "Arturo el Paladín");

        // 3. CREACIÓN Y EQUIPAMIENTO DEL ARMA
        // Creamos un Arco Largo (20 de potencia base, potenciador desactivado de momento)
        Arma arcoLargo = new Arma(origen, "Arco Largo de Fresno", 20);
        
        // Le creamos munición y cargamos el arma (para probar la List<Proyectil>)
        Proyectil flecha1 = new Proyectil("Flecha de Hierro");
        Proyectil flecha2 = new Proyectil("Flecha de Hierro");
        arcoLargo.cargarProyectil(flecha1);
        arcoLargo.cargarProyectil(flecha2);

        // Asociamos el arma al héroe
        heroe.setArma(arcoLargo);

        // 4. CREACIÓN DE LA HORDA DE ENEMIGOS COMUNES
        // Nacen automáticamente con 50 de vida inicial cada uno
        ArrayList<EnemigoComun> hordaEnemigos = new ArrayList<>();
        hordaEnemigos.add(new EnemigoComun(zonaEnemigos, "Goblin Explorador"));
        hordaEnemigos.add(new EnemigoComun(zonaEnemigos, "Orco Guerrero"));

        // 5. CREACIÓN DEL ENEMIGO JEFE (ENEMIGO FINAL)
        // Nace automáticamente con 80 de vida inicial
        EnemigoFinal jefeFinal = new EnemigoFinal(zonaJefe, "Malakar el Nigromante");

        // 6. CREACIÓN Y CONFIGURACIÓN DE LA ETAPA
        // Instanciamos la Etapa 1 pasándole la horda y el jefe final
        Etapa etapa1 = new Etapa(1, "Las Ruinas Olvidadas", jefeFinal, hordaEnemigos,1);

        // 7. ¡QUE COMIENCE LA AVENTURA!
        // Ejecutamos el método que desencadena la lógica y los combates de forma secuencial
        etapa1.jugarEtapa(heroe);

        // 8. VERIFICACIÓN DEL ESTADO FINAL (POST-JUEGO)
        System.out.println("\n==================================================");
        System.out.println("               ESTADO FINAL DEL MUNDO             ");
        System.out.println("==================================================");
        System.out.println("Héroe: " + heroe.getNombre() + " | ¿Sigue vivo?: " + (heroe.sigueVivo() ? "SÍ (Vida: " + heroe.getVidas() + ")" : "NO (💀)"));
        System.out.println("Jefe Final: " + jefeFinal.getNombre() + " | ¿Sigue vivo?: " + (jefeFinal.sigueVivo() ? "SÍ (Vida: " + jefeFinal.getVidas() + ")" : "NO (🎉 Derrotado)"));
        System.out.println("==================================================");
    }
  

    }

