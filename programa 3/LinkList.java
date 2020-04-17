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
   //modificado
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
//fin modificado

 //agregado
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
 //fin agregado

   //borrado
   /*
   public void Desviacion(double promedio, int count){
      double desvn = 0;
      double suma = 0;
      double valor = 0;
      double desviacion = 0;
      Node aux=inicio;
      for(int i = 0; i<count; i++){
         valor = aux.getDato();
         desvn=(Math.pow((valor - promedio),2));
         suma+=desvn;
         System.out.println("Posici'on: "+i+": "+desvn);
         desvn=0;
         aux=aux.getSig();      
      }
      count--;
      desviacion = Math.sqrt(suma/count);
      System.out.println("Desviaci'on: "+desviacion);
      
   public void Imprimir(){
      Node aux=inicio;
      while(aux!=null){
         System.out.println("nodo: "+aux.getDato());
         aux=aux.getSig();
      }
   }  
   }
   */
//fin borrado   
}
