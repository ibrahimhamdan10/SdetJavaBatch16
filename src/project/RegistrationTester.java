package project;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration obj = new Registration();
        obj.setEmail("ibrahimkhaled@yahoo.com");
        System.out.println(obj.getEmail());
        obj.setUserName("ibrahim hamdan");
        System.out.println(obj.getUserName());
        obj.setPassword("palestine2003");
        System.out.println(obj.getPassword());

    }
}
