import java.util.Random;
import java.util.Scanner;

public class Juegos {
    public static void dados() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int dadoTamagotchi = random.nextInt(6) + 1;
            int dadoJugador = random.nextInt(6) + 1;
        }
    }
}

    public static void PPT() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String piedra; //Piedra equivale al numero 0
        String papel; //Papel equivale al numero 1
        String tijera; //Tijera equivale al numero 2
        String resultado;

        int num = random.nextInt(3);
        int eleccionJugador = sc.nextInt();

        if (eleccionJugador == num) {
            resultado = "empate";
        } else if (eleccionJugador  == 2 && num == 1) {
            resultado = "ganaste";
            energia = -2;
            felicidad = +2;
            dinero = +3;
        } else if (eleccionJugador == 0 && num == 2) {
            resultado = "ganaste";
            energia = -2;
            felicidad = +2;
            dinero = +3;
        } else if (eleccionJugador == 1 && num == 0) {
            resultado = "ganaste";
            energia = -2;
            felicidad = +2;
            dinero = +3;
        } else {
            resultado = "perdiste";
            felicidad = -1;
        }
    }
}
