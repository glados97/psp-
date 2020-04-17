class LinkListp4{
   Node inicio=null;

   public LinkListp4(){	
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
   
   //borrado
   /*
   public double Promedio(){
      double suma = 0;
      double valor = 0;
      double promedio = 0;
      Node aux=inicio;
      for(int i = 0; i<10; i++){
         valor = aux.getDato();
         suma  =suma + valor;
         aux=aux.getSig();      
      }
      promedio = suma/10;
      return promedio;
   } 
   */  
   //fin borrado


 
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

//agregado
   public void Imprimir(){
      Node aux=inicio;
      while(aux!=null){
         System.out.println("nodo: "+aux.getDato());
         aux=aux.getSig();
      }
//fin agregado
   } 
    
}