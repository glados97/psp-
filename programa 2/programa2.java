/******************************************************************/
/* Program Assignment:  programa2                                 */
/* Name:                Gladys Garza                              */
/* Date:                15/02/2020                                */
/******************************************************************/
//agregado
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class programa2{
   public static void main(String[]args){
      int contf = 0;
      int contl = 0;
      int conti = 0;
      
      int contclass = 0;  
      int contmet = 0;
      int contr = 0;
      boolean sr = false;
      int contb = 0;
      boolean sb = false;
      int conta = 0;
      boolean sa = false;
      int contm = 0;
      boolean sm = false;
   
      String linea;
      System.out.println("Dame el nombre del programa");
      String programa =Lectura.readString();
      String subs=" ";
   
      File f = new File(programa);
      try {
         BufferedReader file = new BufferedReader(new FileReader(programa));
         try {
            while((linea = file.readLine()) != null){
               contf++;
               linea = linea.trim();
               
               if (linea.length()!=0 && !linea.equals("}")){
                  if (linea.length()>5){
                     subs = linea.substring(0,5);
                  }
                  else
                     subs = " ";
                                    
                  switch (linea){   
                     case "//reutilizado":
                        sr = true;
                           
                        break;
                        
                     case "//fin reutilizado":
                        sr = false;
                        break;
                        
                     case "//borrado":
                        sb = true;
                           
                        break;
                        
                     case "//fin borrado":
                        sb = false;
                        break;
                        
                     case "//agregado":
                        sa = true;
                        break;
                        
                     case "//fin agregado":
                        sa = false;
                        break;
                        
                     case "//modificado":
                        sm = true;
                           
                        break;
                        
                     case "//fin modificado":
                        sm = false;
                        break;
                  }
                     
                  switch(subs){  
                     case "impor":
                        conti++;                   
                        break;
                     
                     case "class":
                        contclass++;
                        break;
                     
                     case "publi":
                        contmet++;
                        break;
                     
                     case "priva":
                        contmet++;
                        break;
                  }
               
                  
                  if (linea.length()>=2 && !linea.substring(0,2).equals("//") && !linea.substring(0,2).equals("/*") && linea.endsWith("*/")==false){
                  
                     contl++;
                                                
                     if(sr == true){
                        contr++;
                     }
                     if(sb == true){
                        contb++;
                        contl--;                     
                     }
                     if(sa == true){
                        conta++;
                     }
                     
                     if(sm == true){
                        contm++;   
                     }              
                  }
               }
            }
            System.out.println("El nu'mero de lineas fi'sicas:" + contf);
            System.out.println("El nu'mero de lineas lo'gicas:" + contl);
            System.out.println("El nu'mero de lineas import:" + conti);
            System.out.println("El nu'mero de lineas clases:" + contclass);
            System.out.println("El nu'mero de lineas metodo:" + contmet);
            System.out.println("El nu'mero de lineas reutilizadas:" + contr);
            System.out.println("El nu'mero de lineas borradas:" + contb);
            System.out.println("El nu'mero de lineas agregadas:" + conta);
            System.out.println("El nu'mero de lineas modificadas:" + contm);
         } 
         catch (IOException e) {
            e.printStackTrace();
         }
      } 
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
   }
}
//fin agregado