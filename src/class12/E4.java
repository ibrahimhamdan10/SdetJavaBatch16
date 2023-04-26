package class12;

public class E4 {
    public static void main(String[] args) {

        String name= "ibrahim";
        int counter=0;
        for (int i =0;i<name.length();i++){
            if(name.charAt(i)=='r') {
                System.out.println(name.charAt(i));
                counter++;
            }
        }
        System.out.println(counter);
    }
}
