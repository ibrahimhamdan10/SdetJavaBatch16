package calss16;

public class person {
    public static void main(String[] args) {
        person obj = new person();
        obj.password="ibrahim";
        obj.printPassword();
        System.out.println(person.bankBalance);
    }
    private static int bankBalance=5435;
    private String password;

    private void printPassword(){
        System.out.println(password);
    }
}
