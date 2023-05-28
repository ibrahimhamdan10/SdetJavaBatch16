package repilt2;

public class Dog {

    String dogName;
    float dogWeight;
    static String dogBreed="Mutt";

    public Dog (String dogName,String dogBreed,float dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
        this.dogBreed=dogBreed;
    }
    void display(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }

    public static void main(String[] args) {

        Dog obj = new Dog ("Tarzan","Mutt",5.0f);
        obj.display();
        Dog obj2 = new Dog ("Lucy","Mutt",4.4f);
        obj2.display();

    }

}
