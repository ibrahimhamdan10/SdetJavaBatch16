package training;

public class Mainmm {
    public static void main(String[] args) {
       Mainmm obj = new Mainmm();
       String result= obj.censorLetter("computer science",'e');
        System.out.println(result);
        String result2= obj.censorLetter("trick",'t');
        System.out.println(result2);
    }

    String censorLetter(String a,char b){
        String  givenCharacter="";
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)==b) {
                givenCharacter += '*';
            }else
                givenCharacter+=a.charAt(i);
        }
        return givenCharacter;

    }

}
   /* Main obj = new Main();
        System.out.println(obj.censorLetter("computer science", 'e'));
        System.out.println(obj.censorLetter("trick or treat", 't'));
    }

     String censorLetter(String x, char z) {
        return x.replace(z, '*');
    }*/
