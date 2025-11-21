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
        int seleccionjuego;
        int selecciontienda;
        int seleccionFinal;

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

            if (seleccion == 3) {

                System.out.println("Elige a que quieres jugar:");
                System.out.println("1. Dados");
                System.out.println("2. Piedra papel o tijera");
                seleccionjuego = sc.nextInt();
                if (seleccionjuego == 1) {
                    Juegos.dados();
                } else {
                    Juegos.PPT();
                }
            }

            if (seleccion == 4) {
                System.out.println("Bienvenido a la tienda");
                System.out.println("Dinero disponible: " + dinero);
                System.out.println("Objetos disponibles:");
                System.out.println("1. Redbull: 4 monedas");
                System.out.println("2. Pizza: 2 monedas");
                System.out.println("3. LSD: 5 monedas");

                selecciontienda = sc.nextInt();

                if (selecciontienda == 1 && dinero >= 4) {
                    System.out.println("Has comprado un redbull, tu energia se acaba de disparar!");
                    energia = +7;
                    System.out.println("Energia: " + energia);
                } else if (selecciontienda == 2 && dinero >= 2) {
                    System.out.println("Has obtenido 'pizza'");
                    comida = +1;
                } else if (selecciontienda == 3 && dinero >= 5){
                    System.out.println("Has comprado LSD (mejor que no se enteren las autoridades), no es la mejor manera de ser feliz a la larga, pero no te juzgaré");
                    felicidad = +6;
                }
            }

            if (seleccion == 5) {

                System.out.println("Energia: " + energia + " | Hambre: " + hambre + " | Felicidad: " + felicidad + " | Dinero: " + dinero);
                System.out.println("--------------------------------------------");

                if (felicidad  > 7 && hambre > 4 && energia > 5) {
                    System.out.println(nombre + " esta feliz y activo");
                } else if (hambre <= 3) {
                    System.out.println(nombre + " se esta muriendo de hambre, dale de comer >:( ");
                } else if (energia <= 3) {
                    System.out.println(nombre + " esta muy cansado (como si trabajara), mandalo a dormir");
                } else if (felicidad <= 3) {
                    System.out.println(nombre + " esta al borde de la depresion, juega con el (o mandalo a terapia, lo que creas conveniente)");
                } else if (energia > 7 && hambre < 5) {
                    System.out.println(nombre + " esta hiperactivo (parece que se ha metido una rayita de coca)");
                } else {
                    System.out.println(nombre + " esta a un paso de reunirse con el de arriba");
                }
            }

            if (seleccion == 6) {
                break;
            }

            if (energia == 0 || hambre == 0 || felicidad == 0) {
                if (energia == 0) {
                    System.out.println("Se dice que la falta de sueño es peligrosa y efectivamente, " + nombre + " ha muerto");
                } else if (hambre == 0) {
                    System.out.println("Parece ser que no eres capaz de tener a tu cuidado ningun ser vivo. " + nombre + " ha muerto de inanición, irresponsable >:v");
                } else {
                    System.out.println(nombre + " era muy infeliz a tu lado y ha preferido tirarse del balcón a seguir contigo.");
                }

                System.out.println("Quieres crear otra mascota? (yo diria que no porque si se te ha muerto una, no traigas a otra a sufrir)");
                System.out.println("1. Si, quiero crear otra");
                System.out.println("2. No, con haber hecho sufrir a una es suficente");

                seleccionFinal = sc.nextInt();

                if (seleccionFinal == 2) {
                    System.out.println("Gracias por pensarlo mejor y no hacer sufrir a mas tamagotchis");
                    break;
                } else {

                }
            }

        }
    }
}
