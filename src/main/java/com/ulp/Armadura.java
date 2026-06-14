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
class Armadura {
    private int duracion;
    private int resistencia;
    private List<Bracera> braceras;
    private List<CubrePierna> cubrePiernas;
    private Casco casco;
    
    public Armadura() {
        this.duracion = 100;
        this.resistencia = 50;
        this.braceras = new ArrayList<>();
        this.cubrePiernas = new ArrayList<>();
        this.casco = null;
    }    
        
    //CPON ESTOS METODOS DE GESTION PRUEBO QUE ES UN AGREGACION
    //PORQUE LAS PARTES SE OBTIENEN DEL ENEMIGO (YA EXISTEN PREVIAMENTE)
    
    public void gestionarBracero(Bracera br) {
        if (br != null && this.braceras.size() < 2) {
            this.braceras.add(br);
            System.out.println("Bracero equipado con éxito.");
        } else if (this.braceras.size() >= 2) {
            System.out.println("No podes equiparte con mas braceros. Solo tenes dos brazos");
        }
    }
    
    public void gestionarCubrePierna(CubrePierna cp) {
        if (cp != null && this.braceras.size() < 2) {
            this.cubrePiernas.add(cp);
            System.out.println("Bracero equipado con éxito.");
        } else if (this.cubrePiernas.size() >= 2) {
            System.out.println("No podes equiparte con mas cubre piernas. Solo tenes dos piernas");
        }
    }
    
    public void gestionarCasco(Casco cc){
        if (cc!=null && casco==null){
            this.casco = cc;
            System.out.println("Ahora tenes un casco");
        } else{
            System.out.println("No podes usar mas de un casco.");
        }
    }
    
    //ACÀ DESTRUYO LA ARMADURA Y SIMULO UNA COMPOSICION
    public void destruirArmadura() {
        this.duracion = 0;
        this.resistencia =0;
        
            this.casco = null; 
            this.braceras.clear();    
            this.cubrePiernas.clear(); 
        System.out.println("La armadura ha sido destruira");   }
    
    
}

