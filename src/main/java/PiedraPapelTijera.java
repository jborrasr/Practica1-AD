import java.util.*;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlantillaPiedraPapelTijera obj = new PlantillaPiedraPapelTijera();
        int salida = 0;
        String opcion;
        int parseOpcion;
        while(salida == 0) {


           while (true) {
               System.out.println("\n(1): Nivel Normal");
               System.out.println("(2): Nivel Dificil");
               try {
                   opcion = sc.nextLine();
                   parseOpcion = Integer.parseInt(opcion);
                   if (parseOpcion < 1 || parseOpcion > 2) {

                       System.out.println("Ingresa una opcion valida");
                       continue;
                   } else {
                       break;
                   }
               } catch (Throwable exc) {

                   System.out.println("Ingresa una opcion valida");
               }
           }
           switch(parseOpcion) {

               case 1:
                   System.out.println("Nivel Normal");
                   break;
               case 2:
                   System.out.println("Nivel Dificil");
                   break;


           }

            while(true) {
                System.out.println("\n(1): Piedra");
                System.out.println("(2): Papel");
                System.out.println("(3): Tijera");
                System.out.println("(4): Salir");
                try {
                    opcion = sc.nextLine();
                    parseOpcion = Integer.parseInt(opcion);
                    if(parseOpcion < 1 || parseOpcion > 4) {
                        System.out.println("Ingresa una opcion valida");
                        continue;
                    }else {
                        break;
                    }
                }catch(Throwable exc) {
                    System.out.println("Ingresa una opcion valida");
                }
            }
            switch(parseOpcion) {
                case 1:
                    obj.piedra();
                    break;
                case 2:
                    obj.papel();
                    break;
                case 3:
                    obj.tijera();
                    break;
                case 4:
                    salida = obj.salida();
                    sc.close();
                    break;
            }
           }
        }
    }
