package class11;

public class E3 {
    public static void main(String[] args) {

        String[][] names = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Ibrahim", "Halima", "Alina", "Semir"}
        };

        for (String[] i : names) {
            for (String j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
