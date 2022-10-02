import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.println("Ingres la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingresa el porcentaje de propina");
        int porcentaje = entrada.nextInt();

//        if (porcentaje < 15)
//            System.out.println("El servicio no fue bueno");
//        }else {
//            System.out.println("El servicio fue bueno");
//        }

        if (porcentaje <15){
            System.out.println("El servicio no fue bueno");
        }else  if(15 <= porcentaje && porcentaje <30){
            System.out.println("El servicio fue bueno");
        }else{
            System.out.printf("El servicio fue exelente");
        }

        double total = cantidad + (cantidad * porcentaje / 100) ;
        System.out.printf("El total es: %.1f", total);
        }
    }