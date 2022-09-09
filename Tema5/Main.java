package Tema5;

public class Main {
        public static void main(String[] args) {
            
            CocheCRUDImpl Coche = new CocheCRUDImpl();
            Coche.save();
            Coche.delete();
            Coche.findAll();
        }
    
}
