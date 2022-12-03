package hw8;

public interface Participant {

    /**
     *
     * @param height высота прыжка
     * @return результат прыжка (удалось перепрыгнуть препятствие или нет)
     */
    boolean jump(int height);

    /**
     *
     * @param lenght дистанция
     * @return результат забега (удалось пробежать дистанцию или нет)
     */
    boolean run(int lenght);

    /**
     * Получить имя бегуна
     * @return Имя
     */
    String getName();

    /**
     * Получить максимальную высоту прыжка
     * @return
     */
    int getMaxJump();

    /**
     * Получить максимальную дистанцию
     * @return
     */
    int getMaxRun();





}
