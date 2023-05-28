package training;

public class Mmm {
    public static void main(String[] args) {
            Mmm obj = new Mmm();
            obj.display(obj.countryName="USA", obj.capital="Washington DC", obj.size=330000000);
            Mmm obj2= new Mmm();
            obj2.display(obj.countryName="Kazakhstan", obj.capital="Astana", obj2.size=18500000 );
    }
    String countryName;
    String capital;
    double size;

    void display( String countryName,String capital,double size){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+size);
    }

}
/*
- name of the country
- capital
- population size

Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;
```
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
```
*/