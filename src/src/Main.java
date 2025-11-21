import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {
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
            int seleccion;

            System.out.println("Energia: " + energia + " | Hambre: " + hambre + " | Felicidad: " + felicidad + " | Dinero: " + dinero);
            System.out.println("--------------------------------------------");

            while (true) {
                System.out.println("Que quieres hacer?");
                System.out.println("1. Dar de comer");
                System.out.println("2. Dormir");
                System.out.println("3. Jugar");
                System.out.println("4. Tienda");
                System.out.println("5. Ver estado");
                System.out.println("6. Salir");

                seleccion = sc.nextInt();

                if (seleccion == 1 && comida == 0) {
                    System.out.println("No tienes comida, compra en la tienda");

                } else if (seleccion == 1 && comida > 0){
                    System.out.println("Has dado de comer a " + nombre);
                    hambre += 3;
                    energia -= 1;
                    System.out.println("Hambre: " + hambre);
                    System.out.println("Energia: " + energia);
                }

                if (seleccion == 2) {
                    System.out.println("Has recuperado energia al dormir");
                    energia += 4;
                    felicidad -= 1;
                    hambre -= 1;
                    System.out.println("Energia: " + energia);
                    System.out.println("Felicidad: " + felicidad);
                    System.out.println("Hambre: " + hambre);
                }

                if (seleccion == 3) {

                    System.out.println("Elige a que quieres jugar:");
                    System.out.println("1. Dados");
                    System.out.println("2. Piedra papel o tijera");
                    seleccionjuego = sc.nextInt();
                    if (seleccionjuego == 1) {
                        System.out.println("Juego de dados");
                        while (true) {

                            System.out.println("1. Tirar dados");
                            System.out.println("2. Salir");
                            seleccion = sc.nextInt();

                            if (seleccion == 1) {
                                int dadoTamagotchi = random.nextInt(6) + 1;
                                int dadoJugador = random.nextInt(6) + 1;
                                System.out.println("Tu dado: " + dadoJugador);
                                System.out.println("Dado de " + nombre + ":" +  dadoTamagotchi);
                                if (dadoJugador > dadoTamagotchi) {
                                    System.out.println("ganaste");
                                    energia -= 2;
                                    felicidad += 2;
                                    dinero += 3;
                                    hambre -= 1;
                                } else {
                                    System.out.println("perdiste");
                                    felicidad -= 1;
                                    hambre -=1;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        String piedra; //Piedra equivale al numero 0
                        String papel; //Papel equivale al numero 1
                        String tijera; //Tijera equivale al numero 2
                        String resultado;

                        int num = random.nextInt(3);
                        System.out.println("Elige un numero entre 0 y 2 (0 incluido)");
                        System.out.println("0. Piedra");
                        System.out.println("1. Papel");
                        System.out.println("2. Tijera");
                        int eleccionJugador = sc.nextInt();

                        if (eleccionJugador == num) {
                            resultado = "empate";
                            System.out.println(resultado);
                            energia -=2;
                            hambre -=1;
                        } else if (eleccionJugador  == 2 && num == 1) {
                            System.out.println("Tu: Tijera");
                            System.out.println(nombre + ": Papel");
                            resultado = "ganaste";
                            System.out.println(resultado);
                            energia -= 2;
                            felicidad += 2;
                            dinero += 3;
                            hambre -=1;
                        } else if (eleccionJugador == 0 && num == 2) {
                            System.out.println("Tu: Piedra");
                            System.out.println(nombre + ": Tijera");
                            resultado = "ganaste";
                            System.out.println(resultado);
                            energia -= 2;
                            felicidad += 2;
                            dinero += 3;
                            hambre -= 1;
                        } else if (eleccionJugador == 1 && num == 0) {
                            System.out.println("Tu: papel");
                            System.out.println(nombre + ": Piedra");
                            resultado = "ganaste";
                            System.out.println(resultado);
                            energia -= 2;
                            felicidad += 2;
                            dinero += 3;
                            hambre -= 1;
                        } else {
                            System.out.println("Tu: " + eleccionJugador);
                            System.out.println(nombre + ": " + num);
                            resultado = "perdiste";
                            System.out.println(resultado);
                            felicidad -= 1;
                            hambre -=1;
                            energia -=2;
                        }
                    }
                }

                if (seleccion == 4) {
                    System.out.println("Bienvenido a la tienda");
                    System.out.println("Dinero disponible: " + dinero);
                    System.out.println("Objetos disponibles:");
                    System.out.println("1. Redbull: 4 monedas");
                    System.out.println("2. Pizza: 2 monedas");
                    System.out.println("3. LSD: 5 monedas");
                    System.out.println("4. Sobredosis de cocaina: 20 monedas");

                    selecciontienda = sc.nextInt();

                    if (selecciontienda == 1 && dinero >= 4) {
                        System.out.println("Has comprado un redbull, tu energia se acaba de disparar!");
                        energia += 7;
                        dinero -= 4;
                        System.out.println("Energia: " + energia);
                    } else if (selecciontienda == 2 && dinero >= 2) {
                        System.out.println("Has obtenido 'pizza'");
                        comida += 1;
                        dinero -= 2;
                    } else if (selecciontienda == 3 && dinero >= 5){
                        System.out.println("Has comprado LSD (mejor que no se enteren las autoridades), no es la mejor manera de ser feliz a la larga, pero no te juzgaré");
                        felicidad += 6;
                        dinero -= 5;
                    } else if (selecciontienda == 4 && dinero >= 20) {
                        System.out.println("Tan mal esta " + nombre + " como para comprar tanta cocaina? Haz un consumo responsable");
                        felicidad = 0;
                        hambre = 0;
                        energia = 0;
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
                    } else if (felicidad < 2 && hambre < 2 && energia < 2){
                        System.out.println(nombre + " esta a un paso de reunirse con el de arriba");
                    }
                }

                if (seleccion == 6) {
                    break;
                }

                    if (energia == 0 && hambre == 0 && felicidad == 0) {
                        System.out.println(nombre +  " no ha hecho un consumo responsable y le ha dado una sobredosis por meterse unas 20 rayas de coca en tiempo record (a muerto como es comprensible)");
                        break;
                    } else if (hambre <= 0) {
                        System.out.println("Parece ser que no eres capaz de tener a tu cuidado ningun ser vivo. " + nombre + " ha muerto de inanición, irresponsable >:v");
                        break;
                    } else if (felicidad <= 0){
                        System.out.println(nombre + " era muy infeliz a tu lado y ha preferido tirarse del balcón a seguir contigo.");
                        break;
                    } else if (energia <= 0) {
                        System.out.println("Se dice que la falta de sueño es peligrosa y efectivamente, " + nombre + " ha muerto");
                        break;
                    }
            }

                System.out.println("Quieres crear otro tamagotchi? (yo diria que no, porque si se te ha muerto una, no traigas a otra a sufrir)");
                System.out.println("1. Si, quiero crear otro tamagotchi (intenta que no se muera)");
                System.out.println("2. No, con haber hecho sufrir a uno es suficente");

                seleccionFinal = sc.nextInt();

                if (seleccionFinal == 2) {
                    System.out.println("Gracias por pensarlo mejor y no hacer sufrir a mas tamagotchis");
                    break;
                }
            }
        }
    }
