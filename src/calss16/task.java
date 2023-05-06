package calss16;

public class task {
    public static void main(String[] args) {
                task obj = new task();
                int [] arrayValue ={12,14,16};//best way to store array value
                System.out.println(obj.sumArray(arrayValue));
                  }

           int sumArray(int [] arr){
                    int sum=0;
                    for (int i = 0; i <arr.length ; i++) {
                        sum+=arr[i];
                    }return sum;
                }
            }
