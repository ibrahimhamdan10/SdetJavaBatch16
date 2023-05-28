package class22;

public class pdfFile extends father {

    public pdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("open pdfFile");
    }
    @Override
    void close() {
        System.out.println("close pdfFile");
    }

    @Override
    void edit() {
        System.out.println("edit pdfFile");
    }
}
