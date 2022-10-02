import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("How many numbers do you want to process?");
        int cantidad = entrada.nextInt();

        System.out.printf("Enter %d Date\n", cantidad);
        //Este es el ciclo For
//        for (int i =1; i<= cantidad; i++){
//            System.out.printf("Date %d:", i);
//            int num = entrada.nextInt();
//            int result = num * 2;
//            System.out.printf("Date %d processor: %d\n ", i, result);
//        }
        //Este es el ciclo While
        int c=1;
        while (c<=cantidad){
            System.out.printf("Date %d:", c);
            int num = entrada.nextInt();
            int result = num * 2;
            System.out.printf("Date %d processor: %d \n",c,result);
            c++;
        }
    }
}