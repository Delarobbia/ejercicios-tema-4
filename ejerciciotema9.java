public class ejerciciotema9 {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        cliente.setNombre("Victor");
        cliente.setEdad(22);
        cliente.setTelefono(647733928);
        cliente.setCredito(20999);
        System.out.println("Su nombre es:"+cliente.getNombre());
        System.out.println("Su edad es:"+cliente.getEdad());
        System.out.println("Su Telefono es:"+cliente.getTelefono());
        System.out.println("Su Credito es de :"+cliente.getCredito()+" euros");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Eduardo");
        trabajador.setEdad(24);
        trabajador.setTelefono(669987532);
        trabajador.setSalario(3200);
        System.out.println("Su nombre es:"+trabajador.getNombre());
        System.out.println("Su edad es:"+trabajador.getEdad());
        System.out.println("Su Telefono es:"+trabajador.getTelefono());
        System.out.println("Su salario es de:"+trabajador.getSalario()+" euros");


    }

}
class Persona{
    int edad,telefono;
    String nombre;
    public void setEdad(int valor){
        this.edad = valor;
    }
    public void setTelefono(int valor){
        this.telefono = valor;
    }
    public void setNombre(String valor){
        this.nombre = valor;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getNombre(){
        return this.nombre;
    }
}
class Cliente extends Persona{
    int credito;
    public void setCredito(int value){
        this.credito = value;
    }
    public int getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    int salario;
    public void setSalario(int valor){
        this.salario = valor;
    }
    public int getSalario(){
        return this.salario;
    }
}
