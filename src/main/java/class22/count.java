package class22;

public interface count {
    int count(int [] arr);
    int add(int num1,int num2);
}
class inter implements count{

    @Override
    public int count(int[] arr) {
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            count++;
        }
        return count;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }


    public static void main(String[] args) {
        inter obj = new inter();
        int[]a= {2,3,4,5,6,7};
        System.out.println(obj.count(a));

        int result= obj.add(5,5);
        System.out.println(result);
    }
}
