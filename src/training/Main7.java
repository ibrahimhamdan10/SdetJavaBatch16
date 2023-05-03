package training;

public class Main7 {
    public static void main(String[] args) {
        Main7 obj = new Main7();

        int result= obj.addition(15,15);
        System.out.println("addition "+result);//  طريقة ثانية عملنا تخزين بال main مش بالmethodوهيك اسهل

        System.out.println("multiplication "+obj.multiplication(15,2));
        System.out.println("subtraction "+obj.subtraction(40,20));

    }
            int multiplication (int num1,int num2){
                   return num1*num2;
            }
            int addition(int num1,int num2){
                        int result2= num1+num2;
                        return result2;
            }
            int subtraction(int num1,int num2){
                        int result3= num1-num2;
                        return result3;
            }


         }
/*Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30

2. for multiplication multiply two numbers to make 30

3. for Subtraction subtract two numbers to equal 20
*/