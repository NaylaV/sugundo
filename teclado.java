import java.util.Scanner;

public class teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = entrada.nextLine();
        System.out.println("Your name is:"+name);
        System.out.println("What is your age?");
        int age = entrada.nextInt();
        System.out.println("Your age is:"+ age);
    }
}