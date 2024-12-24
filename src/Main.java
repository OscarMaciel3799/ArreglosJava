
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Los arreglos (o arrays) en Java son estructuras de datos que permiten almacenar
        //múltiples valores del mismo tipo en una sola variable.

        //Para declarar un arreglo en Java, se especifica el tipo de datos seguido de corchetes [].

        // Declaración de un arreglo de enteros
        int[] numeros1;

        // Declaración de un arreglo de textos
        String[] nombres;

        // Declaración de un arreglo de numeros con decimales
        double[] precios;

        //Los arreglos pueden ser inicializados de varias maneras:
        //Inicialización durante la declaración
        String[] dias = {"Lunes","Martes","miercoles","Jueves","Viernes","Sabado","Domingo"};
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        //Inicialización después de la declaración
        int[] numeros2 = new int[5]; // Crea un arreglo de 5 elementos
        numeros2[0] = 5; // Asignación de valores
        numeros2[1] = 4;
        numeros2[2] = 3;
        numeros2[3] = 2;
        numeros2[4] = 1;


        //Acceso a Elementos del Arreglo
        String primerDia = dias[0]; // Accede al primer elemento
        System.out.println(primerDia); // Imprime Lunes

        //Recorrer un Arreglo
        //Usando un bucle for
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        //Usando un Bucle for-each
        for (int numero : numeros2) {
            System.out.println(numero);
        }

        //METODOS DE ARREGLOS EN JAVA
        //La mayoria de estos metodos pertenecen a la clase Arrays por lo que para usarlos hay que invocar a la clase

        //Devuelve la longitud del arreglo
        System.out.println("Metodo length => numeros2.length : " + numeros2.length);


        //Devuelve una representación en forma de cadena de texto del arreglo.
        //Ya que si queremos imprimir un arreglo sin el metodo, en realidad nos devuelve su espacio en memoria
        System.out.println("Metodo toString => Arrays.toString(dias) : " + Arrays.toString(dias));
        System.out.println("Sin el metodo toString => dias : " + dias);// [Ljava.lang.String;@448139f0

        //Ordenar el arreglo
        System.out.println("Array no ordenado => Arrays.toString(numeros2) : " + Arrays.toString(numeros2));
        Arrays.sort(numeros2);
        System.out.println("Array ordenado => Arrays.toString(numeros2) : " + Arrays.toString(numeros2));

        //Compara dos arreglos para verificar si son iguales.
        System.out.println("Metodo equals => Arrays.equals(dias, frutas) : " + Arrays.equals(dias, frutas));

        //Asigna un valor específico a cada elemento de un arreglo.
        System.out.println("Array original => Arrays.toString(frutas) : " + Arrays.toString(frutas));
        Arrays.fill(frutas, "Anana");
        System.out.println("Array modificado => Arrays.toString(frutas) : " + Arrays.toString(frutas));
    }
}