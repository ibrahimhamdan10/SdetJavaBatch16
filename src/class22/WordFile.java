package class22;

public class WordFile extends father {
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("open WordFile");
    }

    @Override
    void close() {
        System.out.println("close WordFile");
    }

    @Override
    void edit() {
        System.out.println("edit java fileWordFile");
    }
}
