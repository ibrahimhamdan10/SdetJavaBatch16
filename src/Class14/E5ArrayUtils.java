package Class14;

public class E5ArrayUtils {
    public static void main(String[] args) {
        E5ArrayUtils obj = new E5ArrayUtils();
        int [] arr= {10,20,45};
        boolean result= obj.contains(arr,100);
        System.out.println(result);

    }


    public boolean contains(int[] array,int num) {
        boolean isFound=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                isFound = true;
            }
        }
        return isFound;

    }
}



