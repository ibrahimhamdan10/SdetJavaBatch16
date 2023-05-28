package Tasks;

public class Task1 {
    public static void main(String[] args) {
        Task1 obj = new Task1();
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
