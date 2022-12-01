package hw8;

public class Wall implements Barrier{

    protected String name;
    protected int height;

    public Wall(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public void distance() {
        System.out.printf("Препятствие %s имеет высоту %d м.\n", name, height);
    }
}
