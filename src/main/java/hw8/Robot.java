package hw8;

public class Robot implements Action{

    protected String name;
    protected int runningDistance;
    protected int jumpHeight;

    public Robot(String name, int runningDistance, int jumpHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.printf("Робот %s подпрыгнул на %d м.\n", name, jumpHeight);

    }

    @Override
    public void jump() {
        System.out.printf("Робот %s пробежал %d м.\n", name, runningDistance);

    }
}
