package hw8;

public class Treadmill implements Barrier{

    protected String name;
    protected int distance;

    public Treadmill(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public void distance() {
        System.out.printf("Препятствие %s имеет длинну %d м.\n", name, distance);
    }
}
