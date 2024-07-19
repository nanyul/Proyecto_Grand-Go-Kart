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
    
    
    public Competidor(int edadp, int idp, String categoriap, String equipop){
        this.edad = edadp;
        this.id = idp;
        this.categoria = categoriap;
        this.equipo = categoriap;
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
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public void setEquipo(String equipo){
        this.equipo = equipo;
    }
}
