import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 100;

        int opción;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opción = sc.nextInt();

            switch (opción) {
                case 1:
                    puntos += 20;
                    System.out.println("Ganaste 20 puntos.");
                    break;
                case 2:
                    if (puntos >= 15) {
                        puntos -= 15;
                        System.out.println("Gastaste 15 puntos.");
                    } else {
                        System.out.println("No hay suficientes puntos.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo. . .");
                    break;
                case 4:
                    System.out.println("Tienes" + puntos + "puntos");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opción != 4);

        System.out.println("Puntos restantes: " + puntos);
        sc.close();


    }
}