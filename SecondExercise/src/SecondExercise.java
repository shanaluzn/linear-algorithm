import java.util.Scanner;

public class SecondExercise {

    public static void main(String[] args) {
        //Definir las variables
        int radio;
       final double pi = 3.141592;
        double area;

        //habilito ingreso de datos

        Scanner keyboard = new Scanner(System.in);

        //leo datos ingresados por teclado
        System.out.println("Ingrese el valor del radio del círculo");
        radio = keyboard.nextInt();

        //se hace el proceso
        area = pi * radio * radio;

        //se muestra el resultado
        System.out.println("El resultado es: " + area);


    }
}
