package training;

public class Main8 {
    public static void main(String[] args) {
            Main8 obj = new Main8();
            String result= obj.method("test");
            System.out.println(result.toUpperCase());
    }

    String method(String s) {
       return s;
    }
}
/*Create a method that will accept a String as a parameter and return new String all in upper case

Call method

**Expected Output:**

```
TEST
```*/