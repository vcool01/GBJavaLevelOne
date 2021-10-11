package JavaLevelOne.Lesson6.homeWork6;

public class Cat extends Animals{
    String kind;
    String color;

    public Cat (String name, String color) {
        super(name);
        this.kind = "Cat";
        this.color = color;
        this.restrictionsRun = 200;
        this.restrictionsSwim = 0;
    }

    public void swim(int swimLength){

        System.out.println(this.kind + " " +
                this.name + " can't swim.");
    }



    public void catHello(){
        System.out.println(
                "This is a " + kind + "\n" +
                        "Name " + this.name + "\n" +
                        "Color:  " + this.color
        );
    }
}
