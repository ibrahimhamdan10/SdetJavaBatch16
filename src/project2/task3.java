package project;

public class task3 {
    public static void main(String[] args) {

             task3 obj = new task3();
             int count=obj.count("ibrahim hamdan");
             System.out.println(count);
    }
    public int count(String s){
        if(s.isEmpty()){
            return 0;
        }

        String [] words = s.split("\\s+");
        int count =words.length;
        return count;
    }
}
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.*/
