interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

class Human implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

public class Ex2bezpattern {
    public static void main(String[] args) {
        Workable robot = new Robot();
        Workable human = new Human();

        robot.work();
        human.work();

        ((Eatable) human).eat();
        ((Sleepable) human).sleep();
    }
}
