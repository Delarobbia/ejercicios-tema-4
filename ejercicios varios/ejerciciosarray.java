import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class ejerciciosarray {
    public static void main(String[] args) {
       //Ejercicio 1 
        String[] array = {"Juan","Julia","Laura","Celia","Alejandro","Bea"};
        for (int i =0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
        //Ejercicio 2
        int[][] precio = {{0,0},{1,2},{2,1},{2,2}};
        System.out.println(" ");
        for(int i =0;i<precio.length;i++){
            for(int j=0;j<precio[0].length;j++){
                System.out.print("Posición: "+i+","+j);
                System.out.println("\nValor: "+precio[i][j]);
            }

        }

        //Ejercicio 3
        Vector<Integer> vector = new Vector();
        vector.add(2);
        vector.add(4);
        vector.add(6);
        vector.add(5);
        vector.add(9);
        vector.remove(1);
        vector.remove(1);
        System.out.println(vector);

        //Ejericio 4

        //El problema reside en el uso de recursoso ya que cada vez que se supere
        //el limite tendrá que copiar todos los datos en un nuevo vectro mas grande


        //Ejercicio 5
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Julita");
        lista.add("Laura");
        lista.add("Bea");
        lista.add("Sandra");

        LinkedList<String> lista2 = new LinkedList<String>(lista);
        System.out.println("EL arrayList es: ");
        System.out.println(lista);
        System.out.println("El LinkedList es: ");
        System.out.println(lista2);
        
        //Ejercicio 6

        ArrayList<Integer> bucle = new ArrayList<Integer>();;
        for(int i =0;i<10;i++){
            if(i%2==0){
                continue;
            }else{
                bucle.add(i);
            }
        }
        System.out.println(bucle);


        //Ejercicio 7

        try {
            double x= Dividirporcero(6);
            System.out.println(x+"\n Demo de código");
            
        } catch (ArithmeticException e) {
          System.out.println("Esto no puede hacerse\nDemo de código");
        }
        
        //Ejercicio 8
       
        Copiararchivo("Archivo1", "Archivo2");


        //Ejercicio 9: Se trata de meter notas en un archivo
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cuanos alumnos va a meter?:");
            int a = scanner.nextInt();
            ArrayList<String> Notas = new ArrayList<>();
            for(int i=0;i<a;i++){
                System.out.println("Introduzca Nombre:");
                Notas.add(scanner.nextLine());
                System.out.println("Introduzca Nota: ");
                Notas.add(scanner.nextLine());
            }
            scanner.close();
            PrintStream archivo2 = new PrintStream("Notas.txt");
            archivo2.println(Notas);
            archivo2.close();
        } catch (Exception e) {
            System.out.println("No valido");
        }

    }












    //Funcion ejercicio 7
     static int Dividirporcero(int numero){
          int x = numero/0; 
          return x; 
    }


    //Funcion ejercicio 8
    static void Copiararchivo(String nombre1,String nombre2){
        try {
            InputStream archivo1 = new FileInputStream(nombre1);
            byte []datos = archivo1.readAllBytes();
            archivo1.close();
            PrintStream archivo2 = new PrintStream(nombre2);
            archivo2.write(datos);
            archivo2.close();
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
    
}