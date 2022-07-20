public class ejerciciotema8{
    public static void main(String[] args){
        Persona Persona1 = new Persona();
        Persona1.setEdad(12);
        Persona1.setNombre("Victor");
        Persona1.setTelefono(652245809);
        System.out.println("Edad:"+Persona1.getEdad());
        System.out.println("Nombre:"+Persona1.getNombre());
        System.out.println("Telefono:"+Persona1.getTelefono());


    }
}
    class Persona{
        private int edad,telefono;
        private String nombre;

        public void setEdad(int valor){
            this.edad = valor;
        }
        public int getEdad(){
         return this.edad;
        }
        public void setTelefono(int valor){
            this.telefono = valor;
        }
        public int getTelefono(){
         return this.telefono;
        }
        public void setNombre(String valor){
            this.nombre = valor;
        }
        public String getNombre(){
         return this.nombre;
        }

    }