package HwClass18;

public class TesterTeacher {
    public static void main(String[] args) {
        MathTeacher obj1 = new MathTeacher();
        obj1.name="ibrahim";
        obj1.age=20;
        obj1.gender="male";
        obj1.Discuss();
        obj1.Encourage();
        obj1.speaking();
        obj1.polite();

        PianoTeacher obj2 = new PianoTeacher();
        obj2.name="khaled";
        obj2.age=50;
        obj2.gender="male";
        obj2.Discuss();
        obj2.Encourage();
        obj2.speaking();
        obj2.polite();

        ChemistryTeacher obj3 = new ChemistryTeacher();
        obj3.name="ghada";
        obj3.age=45;
        obj3.gender="female";
        obj3.Discuss();
        obj3.Encourage();
        obj3.speaking();
        obj3.polite();

    }
}
