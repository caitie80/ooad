package zoo;

public abstract class Animal extends Zoo {
    int age;
    char gender;
    int weightInPounds;


    public Animal(int age, char gender, int weightInPounds) {
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public void eat()
    {
        System.out.println("i am eating...");
    }

    public void sleep()
    {
        System.out.println("i am sleeping...");
    }

    public abstract void move();
}
