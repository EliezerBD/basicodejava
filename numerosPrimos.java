import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        //es escaner es para que el usuario ingrese los datos de los numeros 
        Scanner entrada = new Scanner(System.in);
// el sout es para imprimer una linea de texto 
        System.out.println("pro favor ingrese in numero entero positivo");
        // es para que el usuario ingrese un numero que el quiere positivo
        int numero = entrada.nextInt();

        boolean esPrimo = true;
        // el boolean es para que la variable  sea true y el false sea como un numero primo

        for (int i = 2; i * i <= numero; i++) {
            if(numero % i == 0){
            esPrimo = false;
            break;
            }
        }
    //int i = 2; aqui se esta llamado una variable con el valor 2
    // y la utilizo como un bucle que comenzasar en 2
    //i * i <= numero;esta es para que la variable numero se igual o mayor
    //que la variable numero osea que llegue hasta el numeroi que el usuario ingreso
    //   i++   estos es para incrementar el numero 


        if (esPrimo) {
            System.out.println(numero+ " Es un numero primo.");
        }else{
            System.out.println(numero + " no es un numero primo");
        }

        //si la variable esPrimo esto es por que el numero no es primo
        //si el numero es primo la variable false el sout ingrese un texto que numero es primo
        
    }   
}       
