/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaSimulador;

import java.util.Random;

/**
 *
 * @author araya
 */
public class Competencia {
    private double kilometros;
    private int vueltas;
    private String nombre;
    private Competidor[] competidores;
    private int numCompetidores;
    private static final int MAX_COMPETIDOR = 50;
    private static final int PULGADAS_POR_VUELTA = 8150;
    private static final double FACTOR_CONVERSION = 0.0000254;
    private int[] tiemposCompetencia;
    private boolean realizada;
    
    
    public Competencia(String nombre){
        this.kilometros = calcularKilometros(vueltas);
        this.vueltas = generarVueltas();
        this.nombre = nombre;
        this.competidores = new Competidor[50];
        this.numCompetidores = 0;
        this.tiemposCompetencia = new int[MAX_COMPETIDOR];
        this.realizada = false;
    }
    
    public double getKilometros(){
        return this.kilometros;
    }
    
    public int getVueltas(){
        return this.vueltas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Competidor[] getCompetidor(){
        return competidores;
    }
    
    public void setCompetidor(Competidor[] nuevoCompetidor){
        this.competidores = nuevoCompetidor;
    }
    
    public void agregarCompetidor(Competidor competidor){ 
       
        if(numCompetidores < competidores.length){
            competidores[numCompetidores++] = competidor;
        }
    }
    private int generarVueltas() {
        Random rand = new Random();
        return rand.nextInt(21) + 30;  // Genera un número aleatorio entre 30 y 50
    }

    private double calcularKilometros(int vueltas) {
        int totalPulgadas = vueltas * PULGADAS_POR_VUELTA;
        return totalPulgadas * FACTOR_CONVERSION;
        
    }public boolean realizada(){
        return realizada;
    }
    
    public void setRealizada(boolean realizada){
        this.realizada = realizada;
    }
    public void generarTiempos(){
        Random rand = new Random();
        for (int i = 0; i < numCompetidores; i++) {
            int tiempo = rand.nextInt(3000, 6000);
            competidores[i].setTiempoTotal(competidores[i].getTiempoTotal() + tiempo);
            tiemposCompetencia[i] = tiempo;
        }
    }
    
    public int[] getTiemposCompetencia(){
        return tiemposCompetencia;
    }
    
    
    }
