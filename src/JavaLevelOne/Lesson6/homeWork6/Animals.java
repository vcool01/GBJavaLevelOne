package JavaLevelOne.Lesson6.homeWork6;

public class Animals {
    protected String name;
//    protected int runLength;
//    protected int swimLength;
    protected int restrictionsSwim;
    protected int restrictionsRun;


    public Animals() {

        this.name = "Animal Uh-eh";

    }

    public Animals(String name) {
        this.name = name;
        this.restrictionsSwim = 0;
        this.restrictionsRun = 0;

    }

    public void run(int runLength) {
        if (runLength <= restrictionsRun && restrictionsRun > 0) {
            System.out.println(
                    "Animal, name " + this.name + " run "
                            + runLength + " meters.\n");
        } else {
            System.out.println("This animal cannot run this distance");
        }
    }

        public void swim(int swimLength) {
            if (swimLength <= restrictionsSwim && restrictionsSwim > 0) {
                System.out.println(
                        "Animal, name " + this.name + " swim "
                                + swimLength + " meters.\n");
            } else {
                System.out.println("This animal cannot swim this distance");
            }
        }

}
