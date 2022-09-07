package Ejercicios;

public class tema3 {
    public static void main(String[] args) {
        int i;
        String[] nombres = {"Juan","Lucas","Alejandro"};
        String a = "";
        for(i = 0;i<1;i++){
            a = nombres[i];
        }
        for(i = 1;i<nombres.length;i++){
            a = a.concat(" "+nombres[i]);
        }
        System.out.println(a);
        
    }
}
