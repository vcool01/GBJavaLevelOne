package JavaLevelOne.Lesson6.homeWork6;

public class HomeWork6 {
    public static void main (String[] args){
//        int countCat = 0;
//        int countDog = 0;
//        int countAnimals = 0;

        Cat cat1 = new Cat("Mimi", "white");
        cat1.catHello();
        cat1.swim(25);
        cat1.run(50);
        System.out.println("=====================");
        Dog dog1 = new Dog("Piglet", "purebred");
        dog1.dogHello();
        dog1.swim(5);
        dog1.run(350);
        System.out.println("=====================");
        Dog dog2 = new Dog("Cocos", "purebred");
        dog2.dogHello();
        dog2.swim(7);
        dog2.run(175);


    }


}
