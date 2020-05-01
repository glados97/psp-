/******************************************************************/
/* Program Assignment:  programa7                                 */
/* Name:                Gladys Garza                              */
/* Date:                25/04/2020                                */
/******************************************************************/

import java.io.*;
import java.lang.Math; 
//agregado
import java.util.Scanner;
//fin agregado

class programa7{  
   public static void main(String[]args){
      double dato=0;
      Node n;
      
      //agregado
      Scanner s = new Scanner(System.in);
      int c = 0;
      double xk = 0;
      
      do{
         System.out.println("Dame la cantidad de números");
         c = s.nextInt();
      }while(c<=2);
      //fin agregado   
      
   
      LinkList l1=new LinkList(); //x
      LinkList l2=new LinkList(); //y
      
      //modificado
      double xy[]=new double[c]; //xy
   
   
      for(int i=1;i<=c;i++){
      //fin modificado
         //agregado 
         do{
         //fin agregado 
            System.out.println("Dame el numero posici'on "+i+" de la primer lista");
            
            //modificado
            dato = s.nextDouble();
            //fin modificado
         
         //agregado 
         }while(dato<0);
         //fin agregado 
         
         n=new Node(dato);
         l1.Insertar(dato);
         Calculosp7.Multiplicacionxxy(dato, xy, i);
      }
      
      //modificado
      for(int i=1;i<=c;i++){
      //fin modificado
      
         //agregado
         do{
         //fin agregado 
            System.out.println("Dame el numero posici'on "+i+" de la segunda lista");
         
            //modificado
            dato = s.nextDouble();
            //fin modificado
            
         //agregado 
         }while(dato<0);
         //fin agregado 
         
         n=new Node(dato);
         l2.Insertar(dato);
         Calculosp7.Multiplicacionxxy(dato, xy, i);
      }
      
      //agregado
      do{
         System.out.println("Dame xk");
         xk = s.nextDouble();
      }while(xk<=0);
      //fin agregado
      
      //borrado
      /*
      System.out.println("Promedio x "+promediox);
      System.out.println("Promedio y "+promedioy);
      System.out.println("Promedio xy "+promedioxy);
      */
      //fin borrado
      
      double promediox = l1.Promedio(c);
      double promedioy = l2.Promedio(c);
      double promedioxy = Calculosp7.Promedioxxy(xy,c);
      
      double rxy = Calculosp7.Rxy(promedioxy, promediox, promedioy, l1, l2,c);
      System.out.println("r x,y "+rxy);
      
      double r2 =(Math.pow(rxy,2));
      System.out.println("r cuadrada "+r2);
      
      //agregado
      double xcal = Calculosp7.X(rxy,c);
      double p = programa57.resolver(xcal,(c-2));
      double cola = 1 - 2 * p; 
      System.out.println("tail area "+cola);
      //fin agregado
      
      double beta1 = Calculosp7.Beta1(promedioxy, promediox, promedioy, l1,c);
      System.out.println("Beta1 "+beta1);
      
      double beta0 = Calculosp7.Beta0(promedioy, beta1, promediox);
      System.out.println("Beta0 "+beta0);
           
      double yk = beta0 + (beta1 * xk);
      System.out.println("Yk "+yk);
      
      //agregado
      double x = programa67.programa67(.35,(c-2));               
      double o = Calculosp7.Oo(c,l2,beta0,beta1,l1);
      double rango = Calculosp7.Rango(x,o,c,xk,l1,promediox);
      System.out.println("Rango 70% "+rango);
      double upi = yk + rango;
      System.out.println("UPI 70% "+upi);
      double lpi = yk - rango;
      System.out.println("LPI 70% "+lpi);
      //fin agregado
   
   }
}