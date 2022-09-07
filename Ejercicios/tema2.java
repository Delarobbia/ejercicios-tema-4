package Ejercicios;

public class tema2 {
    public static void main(String[] args) {
        double total;
        double precio = 10;
        total = iva(precio);
        System.out.println("El precio con iva es: "+total);


    }
    static double iva(double precio){
        double iva = 1.21;
        return(iva*precio);
    }
}
