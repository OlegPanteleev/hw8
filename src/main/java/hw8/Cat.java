package hw8;

public class Cat implements Action{

    protected String name;
    protected int runningDistance;
    protected int jumpHeight;

    public Cat(String name, int runningDistance, int jumpHeight) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.printf("Кот %s пробежал %d м.\n", name, runningDistance);
    }

    @Override
    public void jump() {
        System.out.printf("Кот %s подпрыгнул на %d м.\n", name, jumpHeight);

    }
}
