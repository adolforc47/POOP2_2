/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2_1;

/**
 *
 * @author Eduardo, Adolfo, Mariana
 */
import java.util.Scanner;
public class POOP2_1 {
    public static void main(String[] args) {
        float area;
        int opcion;
        final float PI=3.14159f;
        Scanner sc=new Scanner(System.in);
        /**
         * @param Dentro del bucle do-while, el método main() usa un enunciado
         * switch para determinar la opción seleccionada por el usuario.
         */
        do{
            System.out.println("Elige la opción");
            System.out.println("1.-Area de círculo");
            System.out.println("2.-Area de triángulo");
            System.out.println("3.-Area de cuadrado");
            System.out.println("4.-Salir");
            opcion=sc.nextInt();
            switch(opcion){
                /**
                 * @param Opción 1, el método main() calcula el 
                 * área de un círculo. 
                 */
                case 1:
                    //Circulo
                    System.out.println("Seleccione el circulo");
                    float radio=15;
                    area=PI*radio*radio;
                    break;
                /**
                 * @param Opción 2, el método main() calcula el 
                 * área de un triángulo.
                 */
                case 2:
                    //Triangulo
                    System.out.println("Seleccione el triangulo");
                    float base=8,altura=5;
                    area=(base*altura)/2;
                    break;
                /**
                 * @param Opción 3, el método main() calcula el 
                 * área de un cuadrado.
                 */
                case 3:
                    //Cuadrado
                    System.out.println("Seleccione el cuadrado");
                    float lado=10;
                    area=lado*lado;
                    break;
                case 4:
                    //Salir
                    System.out.println("Hasta luego"); 
                    continue;
                /**
                 * @param default el usuario elige el 4 que no hace ninguna 
                 * de las opciones
                 */
                default:
                    //Ninguno de los anteriores
                    System.out.println("Su eleccion no es correcta"); 
                    continue;
            }
            System.out.println("El area es: "+area);
        }while(opcion!=4);
        sc.close();
    }
    
}
