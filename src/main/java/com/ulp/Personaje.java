/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

/**
 *
 * @author xiana
 */
class Personaje extends ObjetoMovil{
    private String nombre;
    private int nivelEnergia;
    protected int vidas;             
    protected int capacidadOfensiva;  
    private Arma arma;                // ACÀ ESTA LA ASOCIACION CON ARMA
//    private int ancho;
//    private int alto;
//    private String textura;

    public Personaje(String nombre, int nivelEnergia, int capacidadOfensiva, Arma arma, int ancho, int alto, String textura, Ubicacion ubicacion) {
        super(ubicacion);
        this.nombre = nombre;
        this.nivelEnergia = nivelEnergia;
        this.capacidadOfensiva = capacidadOfensiva;
        this.arma = arma;
//        this.ancho = ancho;
//        this.alto = alto;                 ESTO LO PIDE LA CONSIGA Y ESTA COMENTADO PORQUE NO
//        this.textura = textura;           ME PARECIO RELEVANTE A LOS FINES DEL TP
    }

   
    public Personaje(Ubicacion ubicacion, String nombre, int vidas, int capacidadOfensiva) {
        super(ubicacion); 
        this.nombre = nombre;
        this.vidas = vidas; 
        this.capacidadOfensiva = capacidadOfensiva;
        this.nivelEnergia = 300; // Puse un numero por defecto
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    

     
    public void atacarOtroPersonaje(Personaje otroPersonaje) {
        if (otroPersonaje == null) return;

        int dañoCalculado = this.capacidadOfensiva;

        if (this.arma != null) {
            dañoCalculado += this.arma.getPotencia(); 
        }

        System.out.println(this.nombre + " inflige " + dañoCalculado + " de daño a " + otroPersonaje.getNombre());
        
        otroPersonaje.recibirDanio(dañoCalculado);
    }

    
    
    public void recibirDanio(int danio) {
        this.vidas -= danio;
        if (this.vidas < 0) {
            this.vidas = 0;
        }
        
        System.out.println(this.nombre + " ahora tiene " + this.vidas + " puntos de vida.");
    }

    
    public boolean sigueVivo() {
        if (this.vidas > 0){
            return true;
        }
        return false;
    }


    //ESTOS METODOS NO ESTAN DESARROLLADOS SOLO LOS ESCRIBÌ
    public void caminar() { System.out.println(nombre + " está caminando."); }
    public void correr() { System.out.println(nombre + " está corriendo."); }
    public void saltar() { System.out.println(nombre + " saltó."); }

    
    
}
