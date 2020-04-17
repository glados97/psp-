//reutilizado
class Node {

   double posicion;
   double dato;
   Node sig=null;

   public Node(){
   }

   public Node(double posicion){
      setDato(posicion);
   }

   public void setDato(double dato){
      this.dato=dato;
   }

   public void setSig(Node aux){
      this.sig=aux;
   }

   public double getDato(){
      return this.dato;
   }

   public Node getSig(){
      return sig;
   }
}
//fin reutilizado