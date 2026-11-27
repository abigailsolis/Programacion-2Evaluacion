import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int alumnos;
        int asignaturas;
        double suma;
        double media;
        double mayor = 0;
        double menor = 10;
        System.out.println("Introduce el numero de alumnos:");
        alumnos = sc.nextInt();
        System.out.println("Introduce el numero de asignaturas:");
        asignaturas = sc.nextInt();

        double[][] notas = new double[alumnos][asignaturas];


        for (int i = 0; i < alumnos; i++) {

            System.out.println("Alumno " + (i + 1));

            for (int j = 0; j < asignaturas; j++) {

                System.out.println("Introduce la nota de la asignatura " + (j + 1));
                notas[i][j] = sc.nextDouble();

                if (notas[i][j] > mayor) {
                    mayor = notas[i][j];
                }

                if (notas[i][j] < menor) {
                    menor = notas[i][j];
                }


            }
        }


        for (int i = 0; i < alumnos; i++) {

            suma = 0;

            for (int j = 0; j < asignaturas; j++) {
                suma = suma + notas[i][j];
            }

            media = suma / asignaturas;

            System.out.println("La media del alumno " + (i + 1) + " es: " + media);
        }

        for (int j = 0; j < asignaturas; j++) {

            suma = 0;

            for (int i = 0; i < alumnos; i++) {
                suma = suma + notas[i][j];
            }

            media = suma / alumnos;

            System.out.println("La media de la asignatura " + (j + 1) + " es: " + media);
        }

        System.out.println("La nota mas alta es: " + mayor);
        System.out.println("La nota mas baja es: " + menor);

    }
}

