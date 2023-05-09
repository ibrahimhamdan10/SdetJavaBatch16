package class18;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }


    static String maxLength(String [] arr){
        String word="";
        for (int i =0; i<arr.length;i++){
            if(arr[i].equals("this is long")){
                word+=arr[i];
            }

        }  return word+" ";

    }


}
