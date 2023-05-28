package class12;

public class E4Methods {
    public static void main(String[] args) {
        String name= "ibrahim";
        System.out.println(name.equals("ahmad"));
        System.out.println(name.equals("ibrahim"));
        System.out.println(name.equalsIgnoreCase("IBRAHIM"));

        String sentence ="       hello baby";
        System.out.println(sentence.trim());

        String sentence1 ="java is easy";
        System.out.println(sentence1.startsWith("java"));

        System.out.println(sentence1.endsWith("easy"));
        System.out.println(sentence1.contains("is"));
    }
}
