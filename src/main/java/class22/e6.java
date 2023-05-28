package class22;

public class e6 {
    int findNum(int [] arr,int number){

        for (int i = 0; i <arr.length ; i++) {
                if(arr[i]==number){
                   return arr[i];
                }
        }return -1;
    }

    public static void main(String[] args) {
        e6 obj = new e6();
        int [] a ={1,2,3,4,5,6,7,8,};

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
