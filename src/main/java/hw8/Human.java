package hw8;

public class Human implements Participant {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()){
            System.out.printf("%s перепрыгнул через стену %d см\n", getName(), height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см, \nон смог подпрыгнуть только на %d см\n", getName(), height, getMaxJump());
            return false;
        }
    }

    @Override
    public boolean run(int lenght) {
        if (lenght <= getMaxRun()){
            System.out.printf("%s пробежал по беговой дорожке %d м\n", getName(), lenght);
            return true;
        }
        else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d м, \nон смог пробежать только %d м\n", getName(), lenght, getMaxRun());
            return false;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }
}
