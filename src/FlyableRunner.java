public class FlyableRunner {

    public static void main(String[] args) { //
        //This is how interfaces work
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};

        for(Flyable object: flyingObjects){
            object.fly();
        }

    }
}

interface Flyable{

    void fly();
}

class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("With wings");
    }
}

class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("With fuel");
    }
}
