package OopTraining;

public class Car {
    private String name;
    private int maxSpeed ;
    private float price;
    private int model;

     void setName(String n){
        name = n;
    }
    String getName(){
       return name;
     }
     void setModel(int m){
         if(m>=2014)
            model=m;
         else
             System.out.println("too old");
     }
     int getModel(){
      return model;
     }

}
