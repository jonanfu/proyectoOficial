
package proyectooficial;

import java.util.ArrayList;


public class Preguntas {
    
     private  ArrayList<String> pregunta = new ArrayList<>();
    private  ArrayList<String> opcion1 = new ArrayList<>();
    private  ArrayList<String> opcion2 = new ArrayList<>();
    private  ArrayList<String> opcion3 = new ArrayList<>();
    private  ArrayList<String> opcion4 = new ArrayList<>();
// Añadir elementos a un ArrayList


    
    
    public Preguntas() {
        
        //Pregunta 1
        pregunta.add("¿Comó se les decia a los primeros caminos cuando se fundo el país");
        opcion1.add("Camino de herradura");
        opcion2.add("Camino de de verano");
        opcion3.add("Camino de tierra");
        opcion4.add("Camino de Piedras");
                
        //Pregunta 2        
        pregunta.add("¿Para que eran utilizadas las haciendas?");
        opcion1.add("Agricultura y pastoreo");
        opcion2.add("Floricula");
        opcion3.add("Vivienda");
        opcion4.add("Mineria");
                
        //Pregunta 3
        pregunta.add("¿Cuantos departamentos tenia ecuador al ser fundadado?");
        opcion1.add("3");
        opcion2.add("2");
        opcion3.add("1");
        opcion4.add("5");
        
        //Pregunta 4        
        pregunta.add("El año en que ecuador se separa de la Gran Colombia es...");
        opcion1.add("1830");
        opcion2.add("1855");
        opcion3.add("1789");
        opcion4.add("1877");
        
        //Pregunta 5      
        pregunta.add("¿Que psaba si el peon no le pagaba la deuda al terrateniente?");
        opcion1.add("Iba a la carcel");
        opcion2.add("El terrateniente le perdonaba la deuda");
        opcion3.add("Le quitaban el terreno");
        opcion4.add("Le descontava de su salario");
        
        //Pregunta 6        
        pregunta.add("¿Como se llama al pedaso de tierra que recibia el peon?");
        opcion1.add("Huasipungo");
        opcion2.add("huarochirano");
        opcion3.add("huascar");
        opcion4.add("huasco");
        
        //Pregunta 7        
        pregunta.add("¿Cuantos habitantes tenia la ciudad de Quito?");
        opcion1.add("25.000");
        opcion2.add("10.000");
        opcion3.add("23.000");
        opcion4.add("30.000");
        
        //Pregunta 8        
        pregunta.add("¿Cuantos habitantes tenian los habitates de Cuenca?");
        opcion1.add("20.000");
        opcion2.add("34.000");
        opcion3.add("14.000");
        opcion4.add("18.000");
        
        //Pregunta 9        
        pregunta.add("De que material de eran fabricadas las casas de Guayaquil");
        opcion1.add("Madera");
        opcion2.add("Ladrillo");
        opcion3.add("Tapia");
        opcion4.add("Caña");
        
        //Pregunta 10        
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 11 
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 12        
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 13       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 14       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 15       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 16       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 17       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 18       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 19       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
        //Pregunta 20       
        pregunta.add("¿?");
        opcion1.add("");
        opcion2.add("");
        opcion3.add("");
        opcion4.add("");
        
               
    }

    public String pregunta(int posicion){
        return this.pregunta.get(posicion);
    }
    
    public String opcion1(int posicion){
        return this.opcion1.get(posicion);
    }
    
    public String opcion2(int posicion){
        return this.opcion2.get(posicion);
    }
    
    public String opcion3(int posicion){
        return this.opcion3.get(posicion);
    }
    
    public String opcion4(int posicion){
        return this.opcion4.get(posicion);
    }
}
