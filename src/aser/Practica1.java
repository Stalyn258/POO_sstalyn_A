
package aser;
import java.util.Scanner;

public class Practica1 {
    
public static void main(String[] args) {
   Scanner tv=new Scanner(System.in);
   
   //ingrese numeros
   System.out.println("dato");
     byte num=tv.nextByte();
     
     //numeros
     System.out.println("numeros");
     short nim=tv.nextShort();
     
   //sub
   System.out.println("tipos");
   int nl=tv.nextInt();
   
   //mas datos
   System.out.println("datos");
   long tf=tv.nextLong();
   
   //decimas
   System.out.println("decimas");
   double tg=tv.nextDouble();
   
   //verdadero
   System.out.println("true");
   boolean fr=tv.nextBoolean();
   
   //uno digito
   System.out.println("hola");
   char kl=tv.next().charAt(0);
   
   //quemas
   System.out.println("que mas");
   String  ko=tv.nextLine();
   
   // poner toda lainformacion
    System.out.println("ingrese datos"+num);
    System.out.println("ingrese numeros"+nim);
    System.out.println(" de int"+nl);
    System.out.println("los mas datos"+tf);
    System.out.println("los decimas"+tg);
    System.out.println("verdadero"+fr);
    System.out.println("los digitos"+kl);
    System.out.println("como estas"+ko);
   
   
   
    }
    
}
