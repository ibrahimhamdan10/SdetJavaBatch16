package review7;

public class e4 {
    public static void main(String[] args) {

        e4 obj = new e4();
        String [] result=obj.array("hello ibrahim");
        //System.out.println(result); you cant do it
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i]);
        }
    }
    String[] array(String sentence){
       String []arr=sentence.split(" ");
       return arr;
    }
}
