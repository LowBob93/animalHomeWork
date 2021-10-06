package Animal;

public class Cat extends Animal {

    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }


    @Override
    public String Run(int distance) {
        return ("Кошка " + name + " пробежал(а) " + distance + " метров при отсутсвии лимита");
    }

    @Override
    public String Swim(int distance) {
        return "Кошка " + name + " не умеет плавать";
    }

    @Override
    public String runWithLimit(int distance) {
        if (distance < runLimit) {
            return ("Кошка " + name + " пробежал(а) " + distance + " метров при заданном лимите " + runLimit + ".");
        } else {
            return ("Кошка " + name + " пробежал(а) " + runLimit + " метров при задданом лимите " + runLimit + ".");
        }
    }

    @Override
    public String swimWithLimit(int distance) {
        return "Кошка " + name + " не умеет плавать";
    }
}
