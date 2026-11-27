import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int ciudades;
        int dias;
        int horas = 3;

        System.out.println("Introduce el numero de ciudades:");
        ciudades = sc.nextInt();

        System.out.println("Introduce el numero de dias:");
        dias = sc.nextInt();

        double[][][] temperaturas = new double[ciudades][dias][horas];

        double suma;
        double media;


        for (int i = 0; i < ciudades; i++) {

            System.out.println("Ciudad " + (i + 1));

            for (int d = 0; d < dias; d++) {

                System.out.println("Dia " + (d + 1));

                for (int h = 0; h < horas; h++) {

                    System.out.println("Introduce la temperatura de la hora " + (h + 1));
                    temperaturas[i][d][h] = sc.nextDouble();

                }
            }
        }

        for (int i = 0; i < ciudades; i++) {

            suma = 0;

            for (int d = 0; d < dias; d++) {

                for (int h = 0; h < horas; h++) {

                    suma = suma + temperaturas[i][d][h];

                }
            }

            media = suma / (dias * horas);

            System.out.println("La temperatura media de la ciudad " + (i + 1) + " es: " + media);
        }


        for (int d = 0; d < dias; d++) {

            suma = 0;

            for (int i = 0; i < ciudades; i++) {

                for (int h = 0; h < horas; h++) {

                    suma = suma + temperaturas[i][d][h];

                }
            }

            media = suma / (ciudades * horas);

            System.out.println("La temperatura media del dia " + (d + 1) + " es: " + media);
        }

    }

}
