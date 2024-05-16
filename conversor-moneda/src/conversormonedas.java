import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class conversormonedas {
    public static void main(String[] args) {

        System.out.println("Coversor de monedas");
        System.out.println("*********************");
        System.out.println("Elija una opcion \n");
        System.out.println("1-Dolares a Colones");
        double dolares = 502.24;
        System.out.println("2 Euros a Colones");
        double euros = 535.91;
        System.out.println("3-Pesos Mexicanos a Colones");
        double pesosMexicanos = 29.37;
        System.out.println("4-Colombianos a Colones");
        double pesosColombianos = 0.13;
        System.out.println("5-Yenes a Colones");
        double yenes = 3.25;

        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("Digite el monto a convertir");
            Scanner teclado1 = new Scanner(System.in);
            int montoDolares = teclado1.nextInt();
            System.out.println("La conversion es " + montoDolares * dolares + " Dolares.");


        } else if (opcion == 2) {
            System.out.println("Digite el monto a convertir");
            Scanner teclado2 = new Scanner(System.in);
            int montoEuros = teclado2.nextInt();
            System.out.println("La conversion es " + montoEuros * euros + " Euros.");


        } else if (opcion == 3) {
            System.out.println("Digite el monto a convertir");
            Scanner teclado3 = new Scanner(System.in);
            int montoPesosMexicanos = teclado3.nextInt();
            System.out.println("La conversion es " + montoPesosMexicanos * pesosMexicanos + " Pesos Mexicanos.");

        } else if (opcion == 4) {
            System.out.println("Digite el monto a convertir");
            Scanner teclado4 = new Scanner(System.in);
            int montoPesosColombianos = teclado4.nextInt();
            System.out.println("La conversion es " + montoPesosColombianos * pesosColombianos +" Pesos Colombianos." );

        } else if (opcion == 5) {
            System.out.println("Digite el monto a convertir");
            Scanner teclado5 = new Scanner(System.in);
            int montoYenes = teclado5.nextInt();
            System.out.println("La conversion es " + montoYenes * yenes +" Yenes.");

        }else{
            System.out.println("La opcion no es correcta, gracias...");
        }


    }
}