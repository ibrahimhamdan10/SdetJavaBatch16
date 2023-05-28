package class20;

public class parent {

 void getMarry(){
        System.out.println("Marry to the girl of our choice");
    }
    private void accessBank(){
        System.out.println("Accessing bank");
    }

    static void printNumber(){
        System.out.println(10);
    }

}
  class ibrahim extends parent {
        @Override
        void getMarry() {
            System.out.println("i want to marry no one");

        }
        protected void protect(){
            System.out.println("fuck");
        }
    }

     class parentTester{   public static void main(String[] args) {
         ibrahim obj = new ibrahim();
         obj.getMarry();
         ibrahim.printNumber();
         obj.protect();

     }
  }

