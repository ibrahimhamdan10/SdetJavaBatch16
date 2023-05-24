package repilt152_top;
class Mainn{
   private void  m1 (String s){
      System.out.println(s);
   }
   private void  m1 (String s,String m){
      System.out.println(s+m);
   }
   public static void main (String[]args){

      Mainn obj = new Mainn();
      obj.m1("private m1 method ");
      obj.m1("private m1 method ","with int parameter");
   }
}