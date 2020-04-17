/******************************************************************/
/* Program Assignment:  programa3                                 */
/* Name:                Gladys Garza                              */
/* Date:                21/02/2020                                */
/******************************************************************/

import java.io.*;
import java.lang.Math; 

class programa3{
   
   public static void main(String[]args){
      double dato=0;
      Node n;
      
      //borrado
      /*
      int count=0;
      boolean parar=false;
      char respuesta='s';
      */
      //fin borrado
      
      //modificado
      LinkList l1=new LinkList(); //x
      //fin modificado
      
      
      //agregado
      LinkList l2=new LinkList(); //y
      double xy[]=new double[10]; //xy
      //fin agregado
   
      //modificado
      for(int i=1;i<=10;i++){
         System.out.println("Dame el numero posici'on "+i+" de la primer lista");
         dato = Lectura.readDouble();
         n=new Node(dato);
         l1.Insertar(dato);
         Calculo.Multiplicacionxxy(dato, xy, i);
      }
      
      for(int i=1;i<=10;i++){
         System.out.println("Dame el numero posici'on "+i+" de la segunda lista");
         dato = Lectura.readDouble();
         n=new Node(dato);
         l2.Insertar(dato);
         Calculo.Multiplicacionxxy(dato, xy, i);
      }
      //fin modificado
      
      //borrado
      /*
      System.out.println("Tabla");
      l1.Imprimir();
      do{
         System.out.println("Dame el numero posici'on "+count+" de la primer lista");
         dato=Lectura.readDouble();
         n=new Node(dato);
         l.Insertar(dato);
         
         System.out.println("Deseas insertar otro n'umero? s/n");
         respuesta=Lectura.readChar();
         
         boolean pregunta=false;
         
         do{
            if (respuesta == 'n'){
               parar=true;
               pregunta=true;
            }
            else{
               if (respuesta == 's'){
                  pregunta=true;
               }
               else{
                  System.out.println("No entendo, Deseas insertar otro n'umero? s/n");
                  respuesta=Lectura.readChar();
               }
            }
            count++;
         }while(pregunta == false);
      
      }while(parar == false);
      */
      //fin borrado
      
      //modificado
      double promediox = l1.Promedio();
      System.out.println("Promedio x "+promediox);
      
      double promedioy = l2.Promedio();
      System.out.println("Promedio y "+promedioy);
      //fin modificado
      
      //agregado
      double promedioxy = Calculo.Promedioxxy(xy);
      System.out.println("Promedio xy "+promedioxy);
      
      double beta1 = Calculo.Beta1(promedioxy, promediox, promedioy, l1);
      System.out.println("Beta1 "+beta1);
      
      double beta0 = Calculo.Beta0(promedioy, beta1, promediox);
      System.out.println("Beta0 "+beta0);
      
      double rxy = Calculo.Rxy(promedioxy, promediox, promedioy, l1, l2);
      System.out.println("r x,y "+rxy);
      
      double r2 =(Math.pow(rxy,2));
      System.out.println("r cuadrada "+r2);
      
      double yk = beta0 + (beta1 * 386);
      System.out.println("Yk "+yk);
      //fin agregado
   
      //borrado
      /*
      System.out.println("Desviaci'on Estandar");
      l.Desviacion(promedio, count);
      */
      //fin borrado   
   }
}