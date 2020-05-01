class Calculosp7{
   public Calculosp7(){
   }
   
   public static void Multiplicacionxxy(double dato, double[] xy, int count){
      double valor = 0;
      count --;
      if(xy[count]==0.0){
         xy[count] = (dato);
      }
      
      else{
         valor = xy[count] * dato;      
         xy[count] = valor;
      }
         
   }
   
   public static double Promedioxxy(double[] xy, int n){
      double multiplicacion = 0;
      double valor = 0;
      double promedio = 0;
      double suma = 0;
      
      for(int i = 0; i<n; i++){
         valor = xy[i];
         suma+=valor; 
      }
      promedio = suma/n;
      return promedio;
   }
   
   public static double Beta1(double promedioxy, double promediox, double promedioy, LinkList l1, int n){
      double sumatoriaxy = promedioxy * n;
      double nxxy = n * promediox * promedioy;
      double sumatoriacuadrada = 0;
      double promediocuadrada = 0;
      double valorx = 0;
      double valorx2 = 0;
      for(int i= 0; i<n;i++){
         valorx = l1.Leer(i);
         valorx2 = (Math.pow(valorx,2));
         sumatoriacuadrada = sumatoriacuadrada + valorx2;
      }
      promediocuadrada = (Math.pow(promediox,2));
      double nx2=n*promediocuadrada;
   
      double beta = (sumatoriaxy-nxxy)/ (sumatoriacuadrada-nx2);
      return beta;
   }
   
   public static double Beta0(double promedioy, double beta1, double promediox){
      double beta = promedioy - (beta1 * promediox);
      return beta;
   }
   
   public static double Rxy(double promedioxy, double promediox, double promedioy, LinkList l1, LinkList l2, int n){
      double sumatoriaxy = n * (promedioxy * n);
      double xxy = (promediox * n) * (promedioy * n);
      
      double sumatoriacuadradaxx = 0;
      double promediocuadradaxx = 0;
      double valorxx = 0;
      double valorxx2 = 0;
      for(int i= 0; i<n;i++){
         valorxx = l1.Leer(i);
         valorxx2 = (Math.pow(valorxx,2));
         sumatoriacuadradaxx = sumatoriacuadradaxx + valorxx2;
      }
      promediocuadradaxx = (Math.pow((promediox*n),2));
      
      double sumatoriacuadradaxy = 0;
      double promediocuadradaxy = 0;
      double valorxy = 0;
      double valorxy2 = 0;
      for(int i= 0; i<n;i++){
         valorxy = l2.Leer(i);
         valorxy2 = (Math.pow(valorxy,2));
         sumatoriacuadradaxy = sumatoriacuadradaxy + valorxy2;
      }
      promediocuadradaxy = (Math.pow((promedioy*n),2));
           
      double abajox = (n * sumatoriacuadradaxx) - (Math.pow((promediox*n),2));
      double abajoy = (n * sumatoriacuadradaxy) - (Math.pow((promedioy*n),2));
      double rarriba = sumatoriaxy - xxy;
      double rabajo = abajox * abajoy;
      
      double rxy = (rarriba)/ (Math.sqrt(rabajo));
      return rxy;
   }
   
   //agregado
   public static double X(double rxy, int n){
      double x = (Math.abs(rxy)*Math.sqrt(n-2))/(Math.sqrt(1-(Math.pow(rxy,2))));
   
      return x;
   }
   
   public static double Oo(double n, LinkList l2, double beta0, double beta1, LinkList l1){
      double o = 0; //error el double
      double sumatoria = 0;
      double parte = 0;
      for(int i= 0; i<n; i++){
         double x = l1.Leer(i);
         double y = l2.Leer(i);
         parte = Math.pow((y - beta0 - (beta1*x)),2);
         sumatoria = parte + sumatoria;
      }
      double m = n-2;
      double v = 1 / m;
      o = Math.sqrt(v*sumatoria);
      return o;
   }
   
   public static double Rango(double x, double o, double n, double xk, LinkList l1, double promediox){
      double sumatoria = 0;
      double parte = 0;
      for(int i= 0; i<n;i++){
         double xi = l1.Leer(i);
         parte = Math.pow((xi-promediox),2);
         sumatoria = parte + sumatoria;
      }
      double parte3 = Math.sqrt(1 + (1/n) + (Math.pow((xk-promediox),2) / sumatoria));
      double rango = x * o * parte3;
      return rango;
   }
   //fin agregado

}