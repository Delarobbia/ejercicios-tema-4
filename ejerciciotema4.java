public class ejerciciotema4 {
    public static void main(String[] args){
      int numeroif = 0,numeroWhile =0,numeroFor=0;
      var estacion = "verano";

      if (numeroif>0){
        System.out.println("El numero es positivo");
      }
      else if (numeroif>0){
        System.out.println("El numero es negativo");
      }
      else{
        System.out.println("El numero es 0");
      }
      while(numeroWhile<3){                    //Imprimira del 0 al 2
            System.out.println(numeroWhile);
            numeroWhile++;
      }
      do{           
        numeroWhile=0;                      //Solo imprimira el valor 0
        System.out.println(numeroWhile); 
        numeroWhile++;
      }while(numeroWhile<1);
      for(numeroFor=0;numeroFor<=3;numeroFor++){        //Imprimira del 0 al 3
        System.out.println(numeroFor);
      }
      switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Introduzca una estacion valida");
                break;
      }

      }
  }