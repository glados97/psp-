//reutilizado
class LinkList{
   Node inicio=null;

   public LinkList(){	
   }

   public boolean vacio(){
      return inicio==null;
   }

   public void insertarInicio(double dato){
      Node nuevo = new Node(dato);
      if(vacio()){
         inicio=nuevo;
      }else{
         nuevo.setSig(inicio);
         inicio=nuevo;
      }
   }

   public void Insertar(double dato){
      if(vacio()){
         insertarInicio(dato);
      }else{
      
         Node aux=inicio;
         while(aux.getSig()!=null){
            aux=aux.getSig();
         }
      
         Node nuevo = new Node(dato);
      
         nuevo.setSig(null);
         aux.setSig(nuevo);
      }
   }   
   public double Promedio(int n){
      double suma = 0;
      double valor = 0;
      double promedio = 0;
      Node aux=inicio;
      for(int i = 0; i<n; i++){
         valor = aux.getDato();
         suma  =suma + valor;
         aux=aux.getSig();      
      }
      promedio = suma/n;
      return promedio;
   }   

   public double Leer(int count){
      int i = 0;
      double valor = 0;
      Node aux=inicio;
      while(i!=count){
         aux=aux.getSig();
         i++;
      }
      valor = aux.getDato();
      return  valor;
   }
 }
//fin reutilizado