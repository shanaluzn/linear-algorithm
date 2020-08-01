import java.util.Scanner;

public class fourExercise {
    public static void main(String[] args) {

        int valorUno;
        int valorDos;
        int result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer número: ");
        valorUno =keyboard.nextInt();

        System.out.print("Ingrese el valor del segundo número: ");
        valorDos =keyboard.nextInt();

        if (valorUno > valorDos) {
            result = valorUno;
                    System.out.println("El valor mayor es: " + result);
        } else {
        result = valorDos;
        System.out.println("El valor mayor es: " + result);
        }

    }
}
