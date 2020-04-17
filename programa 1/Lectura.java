//reutilizado
//Lectura
class Lectura{

//byte 
   public static byte readByte(){
      byte x=0;
      byte y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Byte.parseByte(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//short 
   public static short readShort(){
      byte x=0;
      short y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Short.parseShort(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//int
   public static int readInt(){
      byte x=0;
      int y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Integer.parseInt(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//long
   public static long readLong(){
      byte x=0;
      long y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Long.parseLong(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//float
   public static float readFloat(){
      byte x=0;
      float y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Float.parseFloat(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//double
   public static double readDouble(){
      byte x=0;
      double y=0;
      do{
         x=0;
         DataInputStream w=new DataInputStream(System.in);
         String g;
         try{
            g=w.readLine();
            y=Double.parseDouble(g);
         }
         catch(IOException e){
            g="0";
         }
         catch(NumberFormatException e){
            g="1";
            System.out.println("no es un formato valido para este evento");
            x++;
         }
      }while(x>0);
      return y;
   }

//char
   public static char readChar(){
      DataInputStream w=new DataInputStream(System.in);
      String g;
      try{
         g=w.readLine();
      }
      catch(IOException e){g="0";}
      char g2=g.charAt(0);
      return g2;
   }

//String
   public static String readString(){
      DataInputStream w=new DataInputStream(System.in);
      String g;
      try{
         g=w.readLine();
      }
      catch(IOException e){g=" ";}
      return g;
   }
}
//fin reutilizado