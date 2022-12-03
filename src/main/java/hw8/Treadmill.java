package hw8;

public class Treadmill implements Barrier{

    //protected String name;
    private final int lenght;

    public Treadmill(int lenght) {
        this.lenght = lenght;
    }


    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public int getHeight() {
        return 0;
    }

}
