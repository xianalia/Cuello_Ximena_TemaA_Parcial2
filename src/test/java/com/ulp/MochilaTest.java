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

/**
 *
 * @author xiana
 */
public class MochilaTest {
    private Ubicacion origen;
    private Mochila mochila;
    private Comida comida1;
    private Comida comida2;
    private Comida comida3;
    private Comida comida4;
    
    public MochilaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("EMPIEZA EL TESTEO LA MOCHILA");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Finalizaron todas las pruebas de la Mochila");
    }
    
    @BeforeEach
    public void setUp() {
        origen = new Ubicacion(0, 0);
        mochila = new Mochila();
        comida1 = new Comida (origen,"Manzana", 15, 2);
        comida2 = new Comida (origen,"Pera", 20, 1);
        comida3 = new Comida (origen,"Repollo", 25, 3);
        comida4 = new Comida (origen, "Puchero", 35, 5);
    }
    
    @AfterEach
    public void tearDown() {
         System.out.println("Test finalizado");
    }

    //Caso A: La mochila está vacía. Se guardan 3 objetos con éxito.
    //testGuardarObjetosHastaLímite usa assertTrue
    @Test
    public void testGuardarObjetosHastaLimite(){
        assertTrue(mochila.guardarComida(comida4));
        assertTrue(mochila.guardarComida(comida1));
        assertTrue(mochila.guardarComida(comida2));
    }
               
    //Caso B: Mochila con 3 objetos (está llena) y se intenta guardar un cuarto
    //objeto. Espero msj de rechazo o lanzar error. testRechazarGuardarAlSuperarLímite
    //usa AssertEquals, getCantidadActual sigue en 3.   
    
    @Test
    public void testRechazarGuardarAlSuperarLimite(){
        mochila.guardarComida(comida1);
        mochila.guardarComida(comida2);
        mochila.guardarComida(comida3);
        
        boolean resultadoGuardado = mochila.guardarComida(comida4);
        assertFalse(resultadoGuardado, "Guardo la comida por error. No deberia");
        
        assertEquals(3, mochila.getCantidadActual(), "No se puede guardar mas de tres");
        
    }
    
    //Caso C: Se amplía la capacidad de la mochila y se permite guardar más objetos.
    //Llama a mochila.ampliarCapacidad() y assertTrue(mochila.guardar(item) debe
    //poder guardar al ampliar capacidad. AssertEquals, getCantidadActual será 4.
    
    @Test
    public void ampliarCapacidadTest(){
        mochila.guardarComida(comida1);
        mochila.guardarComida(comida2);
        mochila.guardarComida(comida3);
        
        mochila.ampliarCapacidad();
        assertTrue(mochila.guardarComida(comida4),"Error: no amplio la capacidad y no guardo la comida");
        
        assertEquals(4, mochila.getCantidadActual(), "La capacidad actual es 4");
        
    }
    
}

