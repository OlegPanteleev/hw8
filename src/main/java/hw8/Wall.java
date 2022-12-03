package hw8;

public class Wall implements Barrier{

    //protected String name;
    private final int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
