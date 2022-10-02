import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.WeakHashMap;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean jugadorActivo = true;

    public void jugar() {
        String nombreJugador  = obtenerNumeroJugador();
        while (jugadorActivo) {
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numeroJuego = obtenerNumeroAlatorio(1,100);
            System.out.printf("%s, he escogido un numero entre %d y %d, adivinalo\n", nombreJugador, min, max);
            int numeroJugador;

            do {
               numeroJugador = escogeNumero();
               mensaje(numeroJuego,numeroJugador);
                intentos++;

            } while (numeroJuego != numeroJugador);
            System.out.printf("Has ganado, intentos %d\n",intentos);

            jugadorActivo =jugarNuevamente();
        }
    }
    private int obtenerNumeroAlatorio(int min,int max) {
        return min +  (int) (Math.random() * (max - min) + 1);
    }
    private String obtenerNumeroJugador() {
        System.out.println("Hola,¿Cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido, %s, vamos a comenzar\n", nombreJugador);
        return nombreJugador;
    }
    private int escogeNumero(){
        System.out.println("Escoge un numero");
        return entrada.nextInt();
    }
    private void mensaje(int numeroJuego, int numeroJugador){
        if (numeroJuego < numeroJugador) {
            System.out.println("Muy alto, adivina otra vez");
        } else if (numeroJuego > numeroJugador) {
            System.out.println("Muy bajo,adivina otra vez");
        }
    }
    public boolean jugarNuevamente(){
        System.out.println("¿Jugar nuevamente?\n1. Si\n2.No");
        int respuesta = entrada.nextInt();
        if (respuesta == 1){
            System.out.println("Genial, jugamos otra vez");
            return true;
        }else {
            System.out.println("Fin del juego, gracias por participar");
            return false;
        }
    }
}