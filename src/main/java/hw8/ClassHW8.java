package hw8;

public class ClassHW8 {

    public static void main(String[] args) {

        Action cat01 = new Cat("\"Персик\"", 10,1);
        Action robot01 = new Robot("\"Андройд\"", 25, 2);
        Action human01 = new Human("\"Олег\"", 50, 3);

        Barrier barrier01 = new Treadmill("\"Беговая дорожка\"", 15);
        Barrier barrier02 = new Wall("\"Стена\"", 2);

        Object[] participants = new Action[3];
        participants[0] = cat01;
        participants[1] = robot01;
        participants[2] = human01;

        Object[] barriers = new Barrier[2];
        barriers[0] = barrier01;
        barriers[1] = barrier02;

        competition(barriers);
        System.out.println("-----------------------------------------------");
        competition(participants);

    }

    public static void competition(Object[] array) {
        for (Object arr : array) {
            if (arr instanceof Barrier) {
                ((Barrier) arr).distance();
            }
            if (arr instanceof Action) {
                ((Action) arr).run();
                ((Action) arr).jump();
                System.out.println();
                }
            }
        }
}
/*
Если я правельно понял условия задач, то у каждого участника должны быть индивидуальные параметры дистанции и высоты прыжка.
Эти параметры я написал в каждом классе - участнике, значения установил в главном классе. На текущий момент я не понимаю,
как сравнить параметры участников с параметрами препятстыий. Предпологаю, что во второй if нужно добавить это сравнение,
но логику понять не могу.
 */
