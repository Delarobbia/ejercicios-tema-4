package Movil;

public class main {
    public static void main(String[] args) {
        SmartDevice router = new SmartDevice("rojo", 2,"5G",23.5, "Huawei es34");
        Smartphone Poco3 = new Smartphone(7.2, "5 mpx","Am y Fm");
        SmartWatch Gt2 = new SmartWatch(4.3, "Negra","Cuadrada");
        System.out.println("Router: "+router.color+" "+router.peso+" "+router.Redwifi+" "+router.precio+" "+router.modelo);
        System.out.println("Poco3: "+Poco3.pulgadas+Poco3.camara+Poco3.radio);
        System.out.println("Gt2: "+Gt2.pulgadas+" "+Gt2.correa+" "+Gt2.forma);
    }
}
