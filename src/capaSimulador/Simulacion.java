/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaSimulador;



import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


/**
 *
 * @author araya
 */
public class Simulacion {
    private Competidor[] competidores;
    private Competencia[] competencias;
    
    private static final int Max_COM = 50;
    private int contador;
    private Set<Integer> idsExistentes; // se crea para validar que no se repida el id
    
    public Simulacion(){
        competidores = new Competidor[Max_COM];
        competencias = new Competencia[Max_COM];
        contador = 0; 
        idsExistentes = new HashSet<>();
    }
    
    public void registrarCompetidores(Competidor competidor){
        Random rand = new Random();
        while(contador < Max_COM){
           int id = rand.nextInt(401) + 100;
           if(!idsExistentes.contains(id)){
                int edad = rand.nextInt(63)+ 18;
            
                competidor.setEdad(edad);
                competidor.setId(id);
                this.competidores[contador++] = competidor;
                idsExistentes.add(id);
           }
        }
    }
    
    //Metodo para asignar la categoria del competidor
    
    //Metodo para asignarle el equipo al competidor
    
    public void generarCompetencias(){
        String[] nombres = {"Gran Premio Mangos", "Gran Premio Hato", "Gran Premio Chuchecas", "Gran Premio Ganaderos", "Gran Premio Pampa" };
        Random rand = new Random();
        for (String nombre : nombres) {
            int kilometros = rand.nextInt(21)+30;
            
            Competencia competencia = new Competencia(kilometros, nombre);
            this.competencias[contador] = competencia;
        }
    }
    
    public void simularCompetencia(){
        for(Competencia competencia : competencias){
            competencia.generarTiempos(); //mostrar los resultados de la competencia
            mostrarResultadosCompetencia(competencia);
        }
    }
    
    public void mostrarResultadosCompetencia(Competencia competencia){
        System.out.println("Resultados de " + competencia.getNombre() + ":");
        Competidor[] competidores = competencia.getCompetidor();
        
        //Ordenar los competidores por tiempo total
        Arrays.sort(competidores, 0,competencia.getKilometros(), Comparator.comparingInt(Competidor::getTiempoTotal));
        for (Competidor competidor : competidores) {
            if(competidor != null){
                System.out.println("ID: " + competidor.getId() + ", Tiempo Total: " + competidor.getTiempoTotal() + " segundos, Equipo: " + "//aqui va el equipo");
            }
        }
        System.out.println();

    }
    
    public void mostrarResultados() {
        for(int i = 0; i < Max_COM; i++){
            mostrarResultadosCompetencia(competencias[i]);
        }
    }
}
