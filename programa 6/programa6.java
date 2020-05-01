/******************************************************************/
/* Program Assignment:  programa6                                 */
/* Name:                Gladys Garza                              */
/* Date:                15/04/2020                                 */
/******************************************************************/
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class programa6{   
   public static void main(String[]args){
      
      Scanner s = new Scanner(System.in);
      
      //agregado
      double p  = 0;
      double dof = 0;
      
      do{
      //fin agregado
      //modificado 
         System.out.println("p: "); 
         p = s.nextDouble();
      //fin modificado
      //agregado
      }while(p<=0);
      
      do{
      //fin agregado
         System.out.println("DOF: ");
         dof = s.nextDouble();
      //agregado
      }while(dof<=0);
      
      double e = .0000001;
      int vez =1;
      int intento = 2;
      double sumatoria1 = 0;
      double sumatoria2 = 0;
      double dif = 0;
      double x = 1; 
      double delta = .5;
      String signo1 = "pos";
      String signo2 = "pos";
            
      do{
         for(int i = 0; i < intento; i++){
            if (vez == 1){
            
               
               sumatoria1 = resolver(x,dof);
               dif = p - sumatoria1;
                                 
               if(dif>0){
                  x = x + delta;
                  signo1="pos";
               }
               else{
                  x = x - delta;
                  signo1="neg";
               }
               if((dif) >= e || dif < 0 ){
                  intento = intento - 1;
               }
               vez = vez +1;  
            }
            
            
            else{
               if(vez!=2){
                  signo1=signo2;
               }
               else{
                  intento = 1;
               }
                
               sumatoria2 = resolver(x,dof);
            
               dif = p - sumatoria2;
            
               intento = 1;
               if(dif>0){
                  signo2="pos";
               }
               else{
                  signo2="neg";
               }
               if(signo1 != signo2 ){
                  delta = delta / 2;
               }
               if(dif>0){
                  x = x + delta;
               }
               else{
                  x = x - delta;
               }              
                
               vez = vez +1;
            }
         }
      }while((dif) > e || dif < 0 );
   
      x = (double)Math.round(x*100000)/100000;
      //fin agregado
      
      //modificado
      System.out.println("Valor x: "+x);
      //fin modificado
   }
   
   
   public static double resolver(double x,double dof){
      double e = .00001;
      int n = 10;
      int vez =1;
      int intento = 2;
      double sumatoria1 = 0;
      double sumatoria2 = 0;
      double dif = 0;
      do{
         for(int i = 0; i < intento; i++){
            if (vez == 1){
               double dh = x/n;
               n = n + 1;
               double xi[][]=new double[n][7]; 
               xi[0][0] = 0;
               for(int k = 1; k<n; k++){
                  int j = k-1;
                  xi[k][0] = (xi[j][0] + dh);
               }     
               Calculosp5.p1(xi,dof,n);
               Calculosp5.p2(xi,dof,n);
               Calculosp5.p3(xi,dof,n);
               Calculosp5.p4(xi,dof,n);
               Calculosp5.p5(xi,dof,n);
               sumatoria1 = Calculosp5.p6(xi,dof,n);            
               n = n-1;
               vez = vez +1;
            }
            else{
               if(vez!=2){
                  sumatoria1 = sumatoria2;
               }
               else{
                  intento = 1;
               }
               n = n * 2;
               double dh = x/n;
               n = n + 1;
               double xi[][]=new double[n][7]; 
               xi[0][0] = 0;
               for(int k=1; k<n; k++){
                  int j = k-1;
                  xi[k][0] = (xi[j][0] + dh);
               }     
               Calculosp5.p1(xi,dof,n);
               Calculosp5.p2(xi,dof,n);
               Calculosp5.p3(xi,dof,n);
               Calculosp5.p4(xi,dof,n);
               Calculosp5.p5(xi,dof,n);
               sumatoria2 = Calculosp5.p6(xi,dof,n);            
               n = n-1;
               vez = vez +1;
            }
         }
         dif = sumatoria1 - sumatoria2;
      }while((dif) >= e || dif < 0 );
      return sumatoria2;
   }
}

