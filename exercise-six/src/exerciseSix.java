import java.util.Scanner;

public class exerciseSix {
    // ejercicio 1.6 de la guia 9.
    // calcular área de una figura combinada.

    public static void main(String[] args) {

        // Definir variables
        int radio;
        int hipotenusa;
        double areaTriangulo;
        double areaCirculo;
        final double PI = 3.141592;
        double areaFiguraTotal;

        //Habilitar datos ingresados por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio del círculo: ");
        radio = keyboard.nextInt();
        System.out.println("Ingrese el valor de la hipotenusa: ");
        hipotenusa = keyboard.nextInt();;

        //Iniciar proceso
        double catetoFaltante = Math.sqrt((hipotenusa * hipotenusa) - (radio * radio));
        areaTriangulo = (radio * catetoFaltante);
        areaCirculo = (PI * radio * radio) / 2;
        areaFiguraTotal = areaTriangulo + areaCirculo;

        //Mostrar resultado
        System.out.println("El área total de la figura es: " + areaFiguraTotal);


    }
}




