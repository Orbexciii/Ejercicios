public class condicionales {

    public static void main(String[] args) {
        int numero = 0;
        if ( numero > 0);{
        System.out.println("el número es positivo");
        if (numero==0);{
            System.out.println("El número es cero");
        if (numero < 0);{
            System.out.println("el número es negativo");
        }
        }
        int numerowhile = 0;
        
        while(numerowhile < 3) 
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);
            
        do {
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);   
            } 
        while(numerowhile < 3); {
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);
            }
             
        }  
        int numerowhile = 0   ;
        for(numerowhile = 0; numerowhile <=3; numerowhile ++){
            System.out.println(numerowhile);
        
        } 

        String estacion = "primavera";

        switch(estacion){
            case "primavera": 
                System.out.println("estamos en primavera");
                break;
            case "verano":
                System.out.println("estamos en verano");
                break;
            case "otoño":
                System.out.println("estamos en otoño");
                break;
            case "invierno":
                System.out.println("estamos en invierno");
                break;
            default:
                System.out.println("No es una estación válida");
        

    }
       
        } }



 
