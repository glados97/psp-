//agregado
class Calculo{
   public Calculo(){
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
   
   public static double Promedioxxy(double[] xy){
      double multiplicacion = 0;
      double valor = 0;
      double promedio = 0;
      double suma = 0;
      
      for(int i = 0; i<10; i++){
         valor = xy[i];
         suma+=valor; 
      }
      promedio = suma/10;
      return promedio;
   }
   
   public static double Beta1(double promedioxy, double promediox, double promedioy, LinkList l1){
      double sumatoriaxy = promedioxy * 10;
      double nxxy = 10 * promediox * promedioy;
      double sumatoriacuadrada = 0;
      double promediocuadrada = 0;
      double valorx = 0;
      double valorx2 = 0;
      for(int i= 0; i<10;i++){
         valorx = l1.Leer(i);
         valorx2 = (Math.pow(valorx,2));
         sumatoriacuadrada = sumatoriacuadrada + valorx2;
      }
      promediocuadrada = (Math.pow(promediox,2));
      double nx2=10*promediocuadrada;
   
      double beta = (sumatoriaxy-nxxy)/ (sumatoriacuadrada-nx2);
      return beta;
   }
   
   public static double Beta0(double promedioy, double beta1, double promediox){
      double beta = promedioy - (beta1 * promediox);
      return beta;
   }
   
   public static double Rxy(double promedioxy, double promediox, double promedioy, LinkList l1, LinkList l2){
      double sumatoriaxy = 10 * (promedioxy * 10);
      double xxy = (promediox * 10) * (promedioy * 10);
      
      double sumatoriacuadradaxx = 0;
      double promediocuadradaxx = 0;
      double valorxx = 0;
      double valorxx2 = 0;
      for(int i= 0; i<10;i++){
         valorxx = l1.Leer(i);
         valorxx2 = (Math.pow(valorxx,2));
         sumatoriacuadradaxx = sumatoriacuadradaxx + valorxx2;
      }
      promediocuadradaxx = (Math.pow((promediox*10),2));
      
      double sumatoriacuadradaxy = 0;
      double promediocuadradaxy = 0;
      double valorxy = 0;
      double valorxy2 = 0;
      for(int i= 0; i<10;i++){
         valorxy = l2.Leer(i);
         valorxy2 = (Math.pow(valorxy,2));
         sumatoriacuadradaxy = sumatoriacuadradaxy + valorxy2;
      }
      promediocuadradaxy = (Math.pow((promedioy*10),2));
           
      double abajox = (10 * sumatoriacuadradaxx) - (Math.pow((promediox*10),2));
      double abajoy = (10 * sumatoriacuadradaxy) - (Math.pow((promedioy*10),2));
      double rarriba = sumatoriaxy - xxy;
      double rabajo = abajox * abajoy;
      
      double rxy = (rarriba)/ (Math.sqrt(rabajo));
      return rxy;
   }
}
//fin agregado