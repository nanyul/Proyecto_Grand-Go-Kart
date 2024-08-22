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
import javax.swing.JOptionPane;


/**
 *
 * @author araya
 */
public class Simulacion {
    private static Simulacion instance;
    private Competidor[] competidores;
    private Competencia[] competencias;
    private boolean competidoresRegistrados = false;
    private boolean competenciasRegistradas = false;
 
    
    
    private static final int Max_COM = 50;
    private int contador;
    private int contadorC;
    private Set<Integer> idsExistentes; // se crea para validar que no se repida el id
    
    public Simulacion(){
        competidores = new Competidor[Max_COM];
        competencias = new Competencia[Max_COM];
        contador = 0; 
        contadorC = 0;
        idsExistentes = new HashSet<>();
    }


    
      //Métodos para registrar competidores, generar competencias y simular
    public void registrarCompetidores(){
        if (!competidoresRegistrados){
        Random rand = new Random();
        while(contador < Max_COM){
           int id = rand.nextInt(401) + 100;
           if(!idsExistentes.contains(id)){
                int edad = rand.nextInt(63)+ 18;
                
                Competidor competidor = new Competidor(edad,id);
                competidor.setEdad(edad);
                competidor.setId(id);
                this.competidores[contador++] = competidor;
                idsExistentes.add(id);
           }
        }
        JOptionPane.showMessageDialog(null,"Competidores registrados con éxito");
        competidoresRegistrados = true;
     }
    }
    
    public boolean competidoresRegistrados(){ //retorna un false si los competidores no han sido registrados
        return competidoresRegistrados;
    }
    
   public void generarCompetencias() {
       if (!competenciasRegistradas){ //si las competencias no han sido generadas anteriormente
    String[] nombres = {"Gran Premio Mangos", "Gran Premio Hato", "Gran Premio Chuchecas", "Gran Premio Ganaderos", "Gran Premio Pampa"};
    Random rand = new Random();
    
    // Crear una copia del arreglo de nombres para que los nombres sean aleatorios
    String[] nombresAleatorios = nombres.clone();
    
    // Randomiza los nombres
    for (int i = nombresAleatorios.length - 1; i > 0; i--) {
        int j = rand.nextInt(i + 1);
        String temp = nombresAleatorios[i];
        nombresAleatorios[i] = nombresAleatorios[j];
        nombresAleatorios[j] = temp;
    }
    
    // Inicializa el arreglo de competencias
    competencias = new Competencia[nombres.length];
    
    // Crear competencias a partir de los nombres aleatorios
    for (int i = 0; i < nombresAleatorios.length; i++) {
        Competencia competencia = new Competencia(nombresAleatorios[i]);
        this.competencias[i] = competencia;
        
     }
    competenciasRegistradas = true;
    }
   }
   
   public boolean competenciasRegistradas(){
       return competenciasRegistradas;
   }
       
    public Competidor[] getCompetidores() {
        return competidores;
    }
    public Competencia[] getCompetencias() {
    return competencias;
}
    
     
     public void limpiarDatos() {
         contador = 0;  //establece el contador en 0 para los ids
         idsExistentes.clear(); //limpia los ids creados anteriormente
    for (int i = 0; i < competidores.length; i++) {
        competidores[i] = null;  //limpia los competidores
    }
    
    for (int i = 0; i < competencias.length; i++) {
        competencias[i] = null; //limpia las competencias
    }
    competidoresRegistrados = false; //resetea estas variables
    competenciasRegistradas = false;
     }
     
     
     public String resultadosCompetencia(Competencia competencia){
          StringBuilder sb = new StringBuilder();
    int[] tiemposCompetencia = competencia.getTiemposCompetencia();
    Competidor[] competidores = competencia.getCompetidor();

    // Ordena los competidores por tiempo
    for (int i = 0; i < tiemposCompetencia.length - 1; i++) {
        for (int j = i + 1; j < tiemposCompetencia.length; j++) {
            if (tiemposCompetencia[i] > tiemposCompetencia[j]) {
                Competidor tempCompetidor = competidores[i];
                competidores[i] = competidores[j];
                competidores[j] = tempCompetidor;

                int tempTiempo = tiemposCompetencia[i]; //devuelve un arreglo con el tiempo de cada competencia para poder mostrarlo
                tiemposCompetencia[i] = tiemposCompetencia[j];
                tiemposCompetencia[j] = tempTiempo;
            }
        }
    }
            //Crea el toString de la competencia
    for (int i = 0; i < competidores.length; i++) {
        Competidor competidor = competidores[i];
        if (competidor != null) {
            sb.append("ID: ").append(competidor.getId())
              .append(", Tiempo: ").append(tiemposCompetencia[i])
              .append("\n");
        }
    }

    return sb.toString();
}
     
      public String resultadosGeneral() {
           StringBuilder sb = new StringBuilder();
        Competidor[] competidores = getCompetidores();
        int numCompetidores = competidores.length;

        // Ordena los competidores por tiempo total
        for (int i = 0; i < numCompetidores - 1; i++) {
            for (int j = i + 1; j < numCompetidores; j++) {
                if (competidores[i].getTiempoTotal() > competidores[j].getTiempoTotal()) {
                    Competidor temp = competidores[i];
                    competidores[i] = competidores[j];
                    competidores[j] = temp;
                }
            }
        }

        // Crea el toString de los tiempos totales de cada competidor y se calcula la diferencia
       
        for (int i = 0; i < numCompetidores; i++) {
            Competidor competidor = competidores[i];
            int tiempoTotal = competidor.getTiempoTotal();
            int diferencia = 0;
            if (i > 0) {
                diferencia = tiempoTotal - competidores[0].getTiempoTotal();
            }
            sb.append("ID: ").append(competidor.getId())
              .append(", Tiempo Total: ").append(tiempoTotal)
              .append(", Diferencia: ").append(diferencia)
              .append("\n");
        }
        return sb.toString();
    }
    
      public String resultadosCategoria() {
    StringBuilder sb = new StringBuilder();
    int numCategorias = ECategoriaCompetidor.values().length;
    int[] tiemposPorCategoria = new int[numCategorias];    //se almacenan los tiempos por categoria
    String[] nombresCategorias = new String[numCategorias]; //se almacenan los nombres de las categorias
    
    //obtiene la categoria de cada competidor, luego obtiene el indice de las categorias y suma los tiempos de cada competidor a su categoria correspondiente
    for (int i = 0; i < competidores.length; i++) {
        Competidor competidor = competidores[i];
        ECategoriaCompetidor categoria = competidor.getCategoria();
        int index = categoria.ordinal();
        tiemposPorCategoria[index] += competidor.getTiempoTotal();
        
    }

    // Obtiene el valor enum y lo convierte a string
    for (int i = 0; i < numCategorias; i++) {
        nombresCategorias[i] = ECategoriaCompetidor.values()[i].name();
    }

    // Ordena las categorías por tiempo total usando un algoritmo de ordenacion burbuja
    for (int i = 0; i < numCategorias - 1; i++) {
        for (int j = 0; j < numCategorias - i - 1; j++) {
            if (tiemposPorCategoria[j] > tiemposPorCategoria[j + 1]) {
                // Intercambiar tiempos
                int tempTiempo = tiemposPorCategoria[j];
                tiemposPorCategoria[j] = tiemposPorCategoria[j + 1];
                tiemposPorCategoria[j + 1] = tempTiempo;
                
                // Intercambiar nombres de categorías
                String tempNombre = nombresCategorias[j];
                nombresCategorias[j] = nombresCategorias[j + 1];
                nombresCategorias[j + 1] = tempNombre;
            }
        }
    }

    // Calcula las diferencias
    int[] diferenciasPorCategoria = new int[numCategorias];
    for (int i = 1; i < numCategorias; i++) {
        diferenciasPorCategoria[i] = tiemposPorCategoria[i] - tiemposPorCategoria[0];
    }

    // Se crea el toString para mostrar los resultados
    
    for (int i = 0; i < numCategorias; i++) {
            sb.append("Categoría: ").append(nombresCategorias[i])
              .append(", Tiempo Total: ").append(tiemposPorCategoria[i])
              .append(", Diferencia: ").append(diferenciasPorCategoria[i])
              .append("\n");
        }
    return sb.toString();
    }
      
    public String resultadosEquipos(){
       StringBuilder sb = new StringBuilder();
    int numEquipos = EAsignarEquipos.values().length;
    int[] tiemposPorEquipo = new int[numEquipos];    //se almacenan los tiempos por categoria
    String[] nombresEquipos = new String[numEquipos]; //se almacenan los nombres de las categorias
    
    //obtiene la categoria de cada competidor, luego obtiene el indice de las categorias y suma los tiempos de cada competidor a su categoria correspondiente
    for (int i = 0; i < competidores.length; i++) {
        Competidor competidor = competidores[i];
        EAsignarEquipos equipo = competidor.getEquipo();
        int index = equipo.ordinal();
        tiemposPorEquipo[index] += competidor.getTiempoTotal();
        
    }

    // Obtiene el valor enum y lo convierte a string
    for (int i = 0; i < numEquipos; i++) {
        nombresEquipos[i] = EAsignarEquipos.values()[i].name();
    }

    // Ordena las categorías por tiempo total usando un algoritmo de ordenacion burbuja
    for (int i = 0; i < numEquipos - 1; i++) {
        for (int j = 0; j < numEquipos - i - 1; j++) {
            if (tiemposPorEquipo[j] > tiemposPorEquipo[j + 1]) {
                // Intercambiar tiempos
                int tempTiempo = tiemposPorEquipo[j];
                tiemposPorEquipo[j] = tiemposPorEquipo[j + 1];
                tiemposPorEquipo[j + 1] = tempTiempo;
                
                // Intercambiar nombres de categorías
                String tempNombre = nombresEquipos[j];
                nombresEquipos[j] = nombresEquipos[j + 1];
                nombresEquipos[j + 1] = tempNombre;
            }
        }
    }

    // Calcula las diferencias
    int[] diferenciasPorEquipos = new int[numEquipos];
    for (int i = 1; i < numEquipos; i++) {
        diferenciasPorEquipos[i] = tiemposPorEquipo[i] - tiemposPorEquipo[0];
    }

    // Se crea el toString para mostrar los resultados
    
    for (int i = 0; i < numEquipos; i++) {
            sb.append("Equipo: ").append(nombresEquipos[i])
              .append(", Tiempo Total: ").append(tiemposPorEquipo[i])
              .append(", Diferencia: ").append(diferenciasPorEquipos[i])
              .append("\n");
        }
    return sb.toString();
    } 

    public Competidor ganadorGeneral(){ //metodo para obtener el ganador general
        Competidor[] competidores = getCompetidores();
              Competidor ganador = competidores[0];
              for (int i = 1; i < competidores.length; i++) {
                  if (competidores[i].getTiempoTotal() < ganador.getTiempoTotal()){
                  ganador = competidores[i];
        }
    }
              return ganador;                                                                       
    }
    
    public ECategoriaCompetidor ganadorCategoria(){ //metodo para obtener el nombre de la categoria ganadora
        int numCategorias = ECategoriaCompetidor.values().length;
        int[] tiemposCategoria = new int[numCategorias];
        
        for (int i = 0; i < competidores.length; i++) {
            ECategoriaCompetidor categoria = competidores[i].getCategoria();
            int indice = categoria.ordinal();
            tiemposCategoria[indice] += competidores[i].getTiempoTotal();
        }
    int categoriaGanadora = 0;
        for (int i = 1; i < numCategorias; i++){
            if (tiemposCategoria[i] < tiemposCategoria[categoriaGanadora]){
                categoriaGanadora = i;
            }
}
        return ECategoriaCompetidor.values()[categoriaGanadora];
    }
    
    public int ganadorCategoriaTiempo(){  //metodo para obtener el tiempo de la categoria ganadora
        int numCategorias = ECategoriaCompetidor.values().length;
        int[] tiemposCategoria = new int[numCategorias];
        
        for (int i = 0; i < competidores.length; i++) {
            ECategoriaCompetidor categoria = competidores[i].getCategoria();
            int indice = categoria.ordinal();
            tiemposCategoria[indice] += competidores[i].getTiempoTotal();
        }
    int categoriaGanadora = 0;
        for (int i = 1; i < numCategorias; i++){
            if (tiemposCategoria[i] < tiemposCategoria[categoriaGanadora]){
                categoriaGanadora = i;
            }
}
        return tiemposCategoria[categoriaGanadora];
    }
    public EAsignarEquipos ganadorEquipo(){  //metodo para obtener el nombre del equipo ganador
        int numEquipos = EAsignarEquipos.values().length;
        int[] tiemposEquipos = new int[numEquipos];
        
        for (int i = 0; i < competidores.length; i++) {
            EAsignarEquipos equipos = competidores[i].getEquipo();
            int indice = equipos.ordinal();
            tiemposEquipos[indice] += competidores[i].getTiempoTotal();
        }
    int equipoGanador = 0;
        for (int i = 1; i < numEquipos; i++){
            if (tiemposEquipos[i] < tiemposEquipos[equipoGanador]){
                equipoGanador = i;
            }
}
        return EAsignarEquipos.values()[equipoGanador];
    }
    
    
     public int ganadorEquipoTiempo(){  //metodo para obtener el tiempo del equipo ganador
        int numEquipos = EAsignarEquipos.values().length;
        int[] tiemposEquipos = new int[numEquipos];
        
        for (int i = 0; i < competidores.length; i++) {
            EAsignarEquipos equipos = competidores[i].getEquipo();
            int indice = equipos.ordinal();
            tiemposEquipos[indice] += competidores[i].getTiempoTotal();
        }
    int equipoGanador = 0;
        for (int i = 1; i < numEquipos; i++){
            if (tiemposEquipos[i] < tiemposEquipos[equipoGanador]){
                equipoGanador = i;
            }
}
        return tiemposEquipos[equipoGanador];
    }
       
    public static Simulacion getInstance() {
        if (instance == null) {
            instance = new Simulacion();   //metodo para poder mantener la misma instancia de simulacion entre ventanas
        }
        return instance;
    }
}

    
    
    

     
