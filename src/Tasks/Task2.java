package Tasks;

public class Task2 {
    public static void main(String[] args) {
        Task2 obj = new Task2();
        String result= obj.createEmail("ibrahim","hamdan","gmail");
        System.out.println(result);

    }

    public String createEmail(String firstName,String LastName,String emailType){
        return firstName+LastName+"@"+emailType+".com";
    }


}
