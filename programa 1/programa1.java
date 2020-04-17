//agregado
/******************************************************************/
/* Program Assignment:  programa1                                 */
/* Name:                Gladys Garza                              */
/* Date:                3/02/2020                                 */
/******************************************************************/

import java.io.*;
import java.lang.Math; 

class programa1{

   public static void main(String[]args){
      int count=0;
      double dato=0;
      boolean parar=false;
      char respuesta='s';
      Node n;
      LinkList l=new LinkList();
   
      do{
         System.out.println("Dame el numero posici'on "+count);
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
   
      System.out.println("Tabla");
      l.Imprimir();
   
      System.out.println("Promedio");
      double promedio = 0;
   
      promedio = l.Promedio(count);
      System.out.println("Desviaci'on Estandar");
      l.Desviacion(promedio, count);
   
   
   }

}
   

