import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        // es el escaner para saber que numero se ingreso

        System.out.println("introduce un numero");
// este sout es para decirle al usurio una intruccion
        int numero = SC.nextInt();
// el int es para almacenar el dato que ingreso el usuario
        if (numero%2==0){
            System.out.println("El numero "+numero+" numero es divisible entre 2");
        }else {
            System.out.println("El numero "+numero+" numero no es divisible entre 2");
        }
    }
}