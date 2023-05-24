package class22;

public abstract class father {

    private final String name;
    private double size;

    public father(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void printInfo(){
        System.out.println(name+" "+size);
    }
   abstract void open();
    void edit(){
        System.out.println("editing");
    }
   abstract void close();

}
