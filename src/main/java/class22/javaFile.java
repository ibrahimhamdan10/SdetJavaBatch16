package class22;

public class javaFile extends father {

    public javaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("open java file");
    }
    @Override

    void close(){
        System.out.println("close java file");
    }
    @Override
    void edit(){
        System.out.println("edit java file");
    }
}
