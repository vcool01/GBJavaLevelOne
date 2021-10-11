package JavaLevelOne.Lesson6.homeWork6;

public class Dog extends Animals{
    String kind;
    String breed;

    public Dog (String name, String breed) {
        super(name);
        this.kind = "Dog";
        this.breed = breed;
        restrictionsSwim = 10;
        restrictionsRun = 500;
    }
    public void dogHello(){
        System.out.println(
                    "This is a " + kind + "\n" +
                        "Name: " + name + "\n" +
                        "Breed:  " + breed
        );
    }
}
