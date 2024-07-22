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
    private int kilometros;
    private int vueltas;
    private String nombre;
    private Competidor[] competidores;
    private static final int MAX_COMPETIDOR = 50;
    
    public Competencia(int kilometros,String nombre){
        this.kilometros = kilometros;
        this.nombre = nombre;
        this.competidores = new Competidor[50];
    }
    
    public int getKilometros(){
        return this.kilometros;
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
        int indice = 0;
        if(indice < competidores.length){
            competidores[indice++] = competidor;
        }
    }
    
    public void generarTiempos(){
        Random rand = new Random();
        for(Competidor competidor : competidores){
            int tiempo = rand.nextInt(3000,6000);
            competidor.setTiempoTotal(competidor.getTiempoTotal() + tiempo);
        }
    }
}
