/******************************************************************/
/* Program Assignment:  programa4                                 */
/* Name:                Gladys Garza                              */
/* Date:                26/02/2020                                */
/******************************************************************/

import java.io.*;
import java.lang.Math; 

import java.lang.*;

class programa4{
   
   public static void main(String[]args){
      int count=0;
      double dato=0;
      boolean parar=false;
      char respuesta='s';
      Node n;
      LinkListp4 l1=new LinkListp4();
      LinkListp4 l2=new LinkListp4();
      
   //agregado
      double division = 0;
      char lop='s';
      System.out.println("Trabajaras con LOC/Method Data (s/n)");
      lop=Lectura.readChar();
   //fin agregado
      
      do{     
         //agregado
         if(lop == 's'){
         // fin agregado
         
            //modificado
            System.out.println("Dame el numero posici'on "+count+" de Class LOC");
            dato=Lectura.readDouble();
            division = dato;
            //fin modificado
            
            //agregado
            System.out.println("Dame el numero posici'on "+count+" de Number of Methods");
            dato=Lectura.readDouble();
            division = (division / dato);         
            
            n=new Node(division);
            l1.Insertar(division);
            //fin agregado
            
            System.out.println("Deseas insertar otro n'umero ? s/n");
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
         }
         
         if(lop == 'n'){
            System.out.println("Dame el numero posici'on "+count);
            dato=Lectura.readDouble();
            n=new Node(dato);
            l1.Insertar(dato);
         
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
         }
      }while(parar == false);
   
      System.out.println("Tabla");      
   
      //borrado
      /*
      System.out.println("Promedio");
      double promedio = 0;
   
      promedio = l.Promedio(count);
      System.out.println("Desviaci'on Estandar");
      l.Desviacion(promedio, count);
      */
      //fin borrado
      
      //agregado
      System.out.println("Tabla ln");
      double sumaln = Calculop4.Ln(l1,l2,count);
      double avgln = sumaln / count;
      System.out.println("Promedio ln "+avgln);
      
      System.out.println("Tabla (ln(x)-avg)2");
      double o2 = Calculop4.Var(l1,l2,count,avgln);
      o2 = o2 / (count - 1);
      System.out.println("o2: "+o2);
      double o = Math.sqrt(o2);
      System.out.println("o: "+o);

      System.out.println("Rangos Logaritmicos");
      Calculop4.Lntodos(avgln,o);
      //fin agregado
   }
}