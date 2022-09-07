package Movil;

public class SmartWatch extends SmartDevice {

    double pulgadas;
    String correa;
    String forma;

    public SmartWatch(){

    }
    public SmartWatch(double pulgadas,String correa,String forma){

        this.pulgadas =pulgadas;
        this.correa=correa;
        this.forma = forma;
    }
}