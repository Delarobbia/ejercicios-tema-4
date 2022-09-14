

public class ejercicio0 {
    public static void main(String[] args) {
        String palabra = reverse("Hola");
        System.out.println(palabra);
    }
public static String reverse(String texto){
    String reverso = "";
    int i = texto.length()-1;
    if(i !=0){
    while(i>= 0){ 
        reverso += texto.charAt(i);
        i= i-1;
    }
    return reverso;
    }else{
        System.out.println("Palabra incorrecta");
        return "";
    }
}
}

