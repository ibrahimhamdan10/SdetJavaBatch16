public class Tasks {
    public static void main(String[] args) {
        Tasks obj = new Tasks();
        obj.languages("Palestine");
    }

    public void languages(String n){
         if (n.equals("Palestine")) {
          System.out.println("السلام عليكم");
         }else if(n.equals("USA")){
          System.out.println("Hello");
        } else if (n.equals("japanese")) {
          System.out.println("こんにちは");
      }
    }
}
