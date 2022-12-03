package hw8;

public class ClassHW8 {

    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Барсик", 1000, 290),
                new Cat("Персик", 900, 350),
                new Cat("Снежок", 1500, 150),
                new Robot("R3000", 5000, 500),
                new Robot("K9h01", 6000, 700),
                new Robot("T9R700", 1500, 1000),
                new Human("Олег", 2000, 1000),
                new Human("Тимур", 1500, 700),
                new Human("Роман", 3000, 1500)
        };

        Barrier[] barriers = {
                new Treadmill(1000),
                new Treadmill(2000),
                new Treadmill(3000),
                new Wall(300),
                new Wall(700),
                new Wall(250)
        };

        // организуем 2 цикла,
        // проходим по всем бегунам и внутри каждого бегуна прогоняем его по всем препятствиям
        for (Participant p : participants){
            for (Barrier b : barriers){
                // в зависимости от типа препятствия, вызываем тот или инной метод (бежать или прыгать)
                if (b instanceof Treadmill){
                    if (!p.run(b.getLenght())){
                        break; // если нам не удалось пробежать или перепрыгнуть препятствие, выходит из внутрннего цикла
                        // на этом забег для текущего участика заканчивается и мы переходим к следующему
                    }
                }
                else if (b instanceof Wall){
                    if (!p.jump(b.getHeight())){
                        break;
                    }
                }

            }
        }
    }

    }
