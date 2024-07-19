/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaSimulador;

/**
 *
 * @author araya
 */
public class Competidor {
    private int edad;
    private int id;
    private String categoria;
    private String equipo;
    
    
    public Competidor(int edad, int id, String categoria, String equipo){
        this.edad = edad;
        this.id = id;
        this.categoria = categoria;
        this.equipo = categoria;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public String getEquipo(){
        return this.equipo;
    }
}
