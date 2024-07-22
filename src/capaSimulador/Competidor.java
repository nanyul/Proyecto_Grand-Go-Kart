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
    private ECategoriaCompetidor categoria;
    private EAsignarEquipos equipo;
    private int tiempoTotal;
    
    
    public Competidor(int edad, int id){
        this.edad = edad;
        this.id = id;
        this.tiempoTotal = 0;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getEdad(){
        return this.edad;
    }
    

    
    public int getTiempoTotal(){
        return this.tiempoTotal;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    public void setTiempoTotal(int tiempoTotal){
        this.tiempoTotal = tiempoTotal;
    }
}
