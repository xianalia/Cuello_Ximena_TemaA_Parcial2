/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
public class ObjetoMovil extends Objeto {
    
    public ObjetoMovil(Ubicacion ubicacion) {
        super(ubicacion);
    }
    
    public void mover(int nuevoX, int nuevoY){
        if (this.ubicacion != null) {
            this.ubicacion.setX(nuevoX);
            this.ubicacion.setY(nuevoY);
            System.out.println("El objeto se mivio a las nuevas coordenadas.");
        } else {
            this.ubicacion = new Ubicacion(nuevoX, nuevoY);
        }
    }
    
}
