package class22;

public class parentTester {
    public static void main(String[] args) {
        father[]parent={new javaFile("java",10),new WordFile("word",15),new pdfFile("pdf",20)};

        for (int i = 0; i < parent.length; i++) {
            father store =parent[i];
            store.close();
            store.open();
            store.edit();
            store.printInfo();
            System.out.println();
        }
    }
}
