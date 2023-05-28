package class20;

public class animal {
    String name;
    String color;
    int age;

    public animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void sleep(){
        System.out.println("zzzzzzzz");
    }
    void eat (){
        System.out.println("eating");
    }
    void speak(){
        System.out.println("speaking");
}
void display(){
    System.out.println(name+" "+color+" "+age);
}

}
