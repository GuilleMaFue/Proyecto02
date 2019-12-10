/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto02;
import java.util.*;
/**
 *
 * @author daw
 */
 public class mediaClase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;

        do {
            System.out.print("Número de los alumnos de clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);

        double[] notas = new double[numAlum]; 

        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota: ");
            notas[i] = sc.nextDouble();
        }

        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        System.out.printf("Nota media clase: %.2f %n", media);

        System.out.println("Notas superiores a la media de la clase: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1)+ " Nota: " + notas[i]);
            }
        }
    }
}
