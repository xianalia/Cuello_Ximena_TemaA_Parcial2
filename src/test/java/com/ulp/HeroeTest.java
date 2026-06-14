/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ulp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author xiana
 */
public class HeroeTest {
    private Ubicacion origen;
    private Heroe heroe;
    
    public HeroeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("EMPIEZA EL TESTEO DE HEROE");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Finalizaron todas las pruebas del Heroe");
    }
    
    @BeforeEach
    public void setUp() {
        origen = new Ubicacion(0, 0);
        heroe = new Heroe(origen, "Arturo");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Test finalizado");
    }

    
//    Caso D: TestCurarVida() Es un assertEquals de la vida esperada cuando heroe.curarVida()
//    recibe comida.getCura() y coincide. Ej. Héroe tiene 30 de vida, y Comida(“Manzana”, 15)
//    se espera vida del héroe sea 45 pts.
    @Test
    public void curarVidaTest(){
        heroe.setVidas(30);
        
        Comida manzana = new Comida (origen, "manzana", 15, 1);
        heroe.curarVida(manzana);
        
        assertEquals(45,45);
       
    }
    
   }

    

