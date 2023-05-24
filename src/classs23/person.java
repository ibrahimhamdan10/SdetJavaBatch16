package classs23;

public interface person {
     void eat();
}

interface employee extends person{
    void work();
}

class tester implements employee{


    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }
}

