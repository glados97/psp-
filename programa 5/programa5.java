/******************************************************************/
/* Program Assignment:  programa5                                 */
/* Name:                Gladys Garza                              */
/* Date:                22/03/2020                                 */
/******************************************************************/
//agregado
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
class programa5{   
   public static void main(String[]args){
      
      Scanner s = new Scanner(System.in);
      double e = .00001;
      int n = 10;
      
      int vez =1;
      int intento = 2;
      
      
      System.out.println("x: ");
      double x = s.nextDouble();
      System.out.println("DOF: ");
      double dof = s.nextDouble();
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
               n = n + 10;
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
      }while(dif > e);
      System.out.println("Valor P: "+sumatoria2);
   }
}

//fin agregado