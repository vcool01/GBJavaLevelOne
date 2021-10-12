package JavaLevelOne.Lesson6.home;

public class Cat extends Animal {

    public static int countCat = 0;
    public static String typeThisClass = "Кот";

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super(typeThisClass, name, maxJump, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}
