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
        this.categoria = asignarCategoriaSegunEdad();
        this.equipo = asignarEquipoSegunEdad();        
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
    
    public ECategoriaCompetidor getCategoria() {
        return categoria;
    }

    public EAsignarEquipos getEquipo() {
        return equipo;
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
    
    
    public ECategoriaCompetidor asignarCategoriaSegunEdad() {
        if (this.edad >= 18 && this.edad <= 25) {
            return this.categoria = ECategoriaCompetidor.JUVENIL;
        } else if (this.edad >= 26 && this.edad <= 35) {
            return this.categoria = ECategoriaCompetidor.ADULTO;
        } else if (this.edad >= 36 && this.edad <= 45) {
            return  this.categoria = ECategoriaCompetidor.ADULTO_MAYOR;
        } else if (this.edad >= 46 && this.edad <= 55) {
            return this.categoria = ECategoriaCompetidor.VETERANO;
        } else {
            return this.categoria = ECategoriaCompetidor.ORO;
        }
    }
    
    public EAsignarEquipos asignarEquipoSegunEdad(){
        if (this.edad >= 18 && this.edad <= 20) {
            return this.equipo = EAsignarEquipos.Rapidos_Furiosos;
        } else if (this.edad >= 21 && this.edad <= 30) {
            return this.equipo = EAsignarEquipos.Velocidad_Total;
        } else if (this.edad >= 31 && this.edad <= 50) {
           return this.equipo = EAsignarEquipos.Prudencia;
        } else {
           return this.equipo = EAsignarEquipos.Prudencia_Total;
        }
    }
       
    @Override
    public String toString(){
       return "Id: " + this.getId() + ", Edad: " + this.getEdad() + ", Categoria: " + this.getCategoria()+ ", Equipo: " + this.getEquipo()+ "\n";
    }
}