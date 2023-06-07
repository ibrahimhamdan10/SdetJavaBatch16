package class22;

public class javaFile extends father {

    public javaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("open java file.txt");
    }
    @Override

    void close(){
        System.out.println("close java file.txt");
    }
    @Override
    void edit(){
        System.out.println("edit java file.txt");
    }
}
