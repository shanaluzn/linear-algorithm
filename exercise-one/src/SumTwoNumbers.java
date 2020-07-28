import java.util.Scanner;

public class SumTwoNumbers {

    public static void main(String[] args) {

        // definición de variables
        int firstNumber;
        int secondNumber;
        int result;

        //habilito ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //leo datos de usuario
        System.out.println("Ingrese el valor del primer número ");
        firstNumber = keyboard.nextInt();
        System.out.println("Ingrese el valor del segundo número ");
        secondNumber = keyboard.nextInt();

        //se hace el proceso y se guarda en la variable result
        result = firstNumber + secondNumber;

        // se muestra resultado
        System.out.println("El resultado es: " + result);
    }
}


