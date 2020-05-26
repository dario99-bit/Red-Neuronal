/*
 * Implemente un algoritmo que l permita 
1).Desplegar el nombe del proyecto de su paper;
2).Qué es una red neuronal.
3).Cuáles son los elementos que forman una red neuronal.
4).Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado.
5).Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto.
6).En qué consistió el entrenamiento utilizando una red neronal,e indique
   el algoritmo utilizado
 */
package redneuronal_1;

/**
 *
 * @author DARIO
 */
import java.util.Scanner;
public class RedNeuronal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//reserva un espacio de memoria
        System.out.println("Comparación de desempeño de las redes RBF y LOLIMOT"
                + "para modelar las emisiones de NOx de un motot de combustión interna");
        
        System.out.println("¿Qué es una Red Neuronal?");
        String redneuronal=objeto.nextLine();
        
        System.out.println("¿Que es una red neuronal?");
        String neuronal=objeto.nextLine();
        
        System.out.println("¿Cuáles son los elementos que forman una red neuronal?");
        String unaredneuronal=objeto.nextLine();
        
        System.out.println("¿Cómo utilizaron la red neuronal en el proyecto que usted ha seleccionado?");
        String ustedhaseleccionado=objeto.nextLine();
        
        System.out.println("¿Cómo utilizaría usted la red neuronal como mejoramiento al proyecto propuesto?");
        String proyectopropuesto=objeto.nextLine();
        
        System.out.println("¿En qué consistió el entrenamiento utilizando una red neronal,e indique\n" +
"   el algoritmo utilizado?");
        String algoritmoutilizado=objeto.nextLine();
    }
    
}


