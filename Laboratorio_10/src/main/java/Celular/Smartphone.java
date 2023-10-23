/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celular;

/**
 *
 * @author joshi
 */
public class Smartphone implements Camara,NavegadorDeInternet
        ,ReproductorDeMusica { 
    public String marca;
    public String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void grabarvideo() {
       System.out.println("estas Grabando");
    }

    @Override
    public void tomarfoto() {
       System.out.println("estas tomando foto");
    }

    @Override
    public void buscar() {
         System.out.println("buscando....");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando.....");
    }
   
    @Override
    public void reproducir() {
        System.out.println("reproduciendo..");
    }

    @Override
    public void detener() {
        System.out.println("esta detenido");
    }
     public static void main(String[] args) {
        Smartphone celular= new Smartphone("Sansung","J12"); 
        System.out.println("marca: "+ celular.marca);
        System.out.println("modelo: "+ celular.modelo);
        System.out.println("Procesos: ");
        celular.grabarvideo();
        celular.buscar();
        celular.actualizar();
        celular.tomarfoto();
        celular.reproducir();
        celular.detener();
    }
}
