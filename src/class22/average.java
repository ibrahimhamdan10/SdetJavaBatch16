package class22;

public interface average {
    double avg(int [] arr);
}
class Main implements average{
    @Override
    public double avg(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }return sum/arr.length;
    }

    public static void main(String[] args) {

      Main obj = new Main();
        int []a={2,3,4,5,6,7,8};
        System.out.println(obj.avg(a));

    }
}