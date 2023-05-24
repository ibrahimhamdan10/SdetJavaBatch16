package repilt152_top;

class Main {
    public static void main (String []args) {
        Main obj = new Main();
        int result1= obj.subtraction(80, 10, 10, 10);
        System.out.println(result1);

        int result2= obj.subtraction(50, 10, 10);
        System.out.println(result2);

        int result3= obj.subtraction(40, 20);
        System.out.println(result3);
    }
        int subtraction(int num1,int num2){
            return num1-num2;
        }
        int subtraction(int num1,int num2,int num3){
            return num1-num2-num3;
        }
        int subtraction(int num1,int num2,int num3,int num4){
            return num1-num2-num3-num4;
        }
    }

