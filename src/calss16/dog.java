package calss16;

public class dog {

String name;
    String color;
    String breed;

    void park(){
        System.out.println(name+"is barking");
    }
    void printInfo(){
        if(breed.equals("german")){
            System.out.println(name+" "+color+" i can work in nypd");
        }else
            System.out.println(name+" is used as pet");
    }

}
