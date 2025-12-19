interface Worker {
    void work();
    void eat();
    void sleep();
}

interface Workable {
    void work();
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working.");
    }
}

class Human implements Worker {
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

class RobotWorkerAdapter implements Worker {
    private final Workable robot;

    public RobotWorkerAdapter(Workable robot) {
        this.robot = robot;
    }

    @Override
    public void work() {
        robot.work();
    }

    @Override
    public void eat() {
        System.out.println("Robot cannot eat.");
    }

    @Override
    public void sleep() {
        System.out.println("Robot cannot sleep.");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Worker robot = new RobotWorkerAdapter(new Robot());
        Worker human = new Human();

        robot.work();
        human.work();

        robot.eat();
        robot.sleep();

        human.eat();
        human.sleep();
    }
}
