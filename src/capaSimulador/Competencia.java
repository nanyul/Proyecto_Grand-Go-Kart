/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaSimulador;

/**
 *
 * @author araya
 */
public class Competencia {
    private int kilometros;
    private int vueltas;
    private String nombre;
    
    public Competencia(int kilometrosp, int vueltasp, String nombrep){
        this.kilometros = kilometrosp;
        this.vueltas = vueltasp;
        this.nombre = nombrep;
    }
    
    public int getKilometros(){
        return this.kilometros;
    }
    
    public int getVueltas(){
        return this.vueltas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setKilometros(int kilometros){
        this.kilometros = kilometros;
    }
    
    public void setVueltas(int vueltas){
        this.vueltas = vueltas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
