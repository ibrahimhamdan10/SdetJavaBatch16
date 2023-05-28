package class15;

public class h {
    public static void main(String[] args) {

        String word = "abrakadabra";
        String replace = word.replaceAll("[^aAeEiIoOuU]", "");
        System.out.println(replace);

        String str = "0123456789";
        System.out.println(str.substring(4));

        String obj = "I LIKE JAVA";
        System.out.println(obj.charAt(3));

        String c = "Hello i love java";
        boolean var;
        var = c.startsWith("hello");
        System.out.println(var);
    }

}
