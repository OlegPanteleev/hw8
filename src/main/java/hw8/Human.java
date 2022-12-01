package hw8;

public class Human implements Action{

    protected String name;
    protected int runningDistance;
    protected int jumpHeight;

    public Human(String name, int runningDistance, int jumpHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.printf("Человек %s подпрыгнул на %d м.\n", name, jumpHeight);

    }

    @Override
    public void jump() {
        System.out.printf("Человек %s пробежал %d м.\n", name, runningDistance);

    }
}
