//reutilizado
class Calculosp57{
   public static void p1(double xi[][], double dof, int n){
      for(int i=0;i<n;i++){
         xi[i][1] = 1+(Math.pow(xi[i][0],2)/dof);
      }
   }
   
   public static void p2(double xi[][], double dof, int n){
      for(int i=0;i<n;i++){
         xi[i][2] = (Math.pow(xi[i][1],(-((dof+1)/2))));
      }
   }
   
   public static void p3(double xi[][], double dof, int n){
      double parte1=((dof+1)/2);
      double parte11 = parte1;               
      if (parte1%1 == 0){
         do{
            if(parte1!=1)
               parte1=parte1-1;
            parte11 = parte11 * parte1; 
         }while(parte1!=1);
      }
      else{
         do{
            if(parte1!=.5)
               parte1=parte1-1;
            parte11 = parte11 * parte1;
         }while(parte1!=0.5);
         parte11 = parte11 * Math.sqrt(Math.PI); 
      }
      
      double parte2 = dof*Math.PI;
      double parte22=Math.pow((parte2),(.5));   
      
      double parte3=((dof)/2);
      double parte33 = parte3;
      if (parte3%1 == 0){
         do{
            if(parte3!=1)
               parte3=parte3-1;
            parte33 = parte33 * parte3; 
         }while(parte3!=1);
      }
      else{
         do{
            if(parte3!=.5)
               parte3=parte3-1;
            parte33 = parte33 * parte3; 
         }while(parte3!=0.5);
         parte33 = parte33 * Math.sqrt(Math.PI); 
      }
        
         
      for(int i=0;i<n;i++){
         xi[i][3] = (parte11/(parte22*parte33));
      }
   }
   
   public static void p4(double xi[][], double dof, int n){
      for(int i=0;i<n;i++){
         xi[i][4] = xi[i][3]*xi[i][2];
      }
   }
   
   public static void p5(double xi[][], double dof, int n){
      for(int i=0;i<n;i++){
         if (i == 0 || i == (n-1)){
            xi[i][5] = 1;
         }
         else{
            if (i % 2 == 0 )
               xi[i][5] = 2;
            else
               xi[i][5] = 4;
         }
      
      }
   }
   
   public static double p6(double xi[][], double dof, int n){
      double sumatoria = 0;
      double gamma = xi[0][3];
      double suma = 0;
      
      for(int i=0;i<n;i++){
         xi[i][6] = (xi[i][4] * xi[i][5] * ((xi[(n-1)][0] / (n-1)) / 3));
         sumatoria = sumatoria + xi[i][6];
      }
      return sumatoria;
   }   
}
//fin reutilizado