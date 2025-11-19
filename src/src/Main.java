import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de tu tamagotchi:");
        String nombre = sc.next();

        String aspecto1 = "🐆";
        String aspecto2 = "🦄";
        String aspecto3 = "🐢";
        System.out.println("Elige el aspecto de tu tamagotchi");
        System.out.println("1. " + aspecto1);
        System.out.println("2. " + aspecto2);
        System.out.println("3. " + aspecto3);
        int aspecto = sc.nextInt();

        if (aspecto == 1) {
            System.out.println(aspecto1 + " " + nombre);
        } else if (aspecto == 2) {
            System.out.println(aspecto2 + " " + nombre);
        } else {
            System.out.println(aspecto3 + " " + nombre);
        }

        int energia = 5;
        int hambre = 5;
        int felicidad = 5;
        int dinero = 5;
        int comida = 0;
        System.out.println("Energia: " + energia + " | Hambre: " + hambre + " | Felicidad: " + felicidad + " | Dinero: " + dinero);
        System.out.println("--------------------------------------------");

        while (true) {
            System.out.println("Que quieres hacer?");
            System.out.println("1. Dar de comer");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Tienda");
            System.out.println("5. Ver estado");
            System.out.println("6. Salir");

            int seleccion = sc.nextInt();

            if (seleccion == 1 && comida > 0) {
                hambre = +3;
                energia = -1;
            } else {
                System.out.println("No tienes comida. Compra en la tienda");
            }

            if (seleccion == 2) {
                energia = +4;
                felicidad = -1;
            }
        }
    }
}
