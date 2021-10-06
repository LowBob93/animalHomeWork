package Animal;

public class Dog extends Animal {

    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public String Run(int distance) {
        return ("Собака " + name + " пробежал(а) " + distance + "метров при отсутсвии лимита");
    }

    @Override
    public String Swim(int distance) {
        return ("Собака " + name + " проплыл(а) " + distance + " метров при отсутсвии лимита");
    }

    @Override
    public String runWithLimit(int distance) {

        if (distance < runLimit) {
            return ("Собака " + name + " пробежал(а) " + distance + " метров при заданном лимите в " + runLimit + ".");
        } else {
            return ("Собака " + name + " пробежал(а) " + runLimit + " метров при задданом лимите в " + runLimit + ".");
        }
    }

    @Override
    public String swimWithLimit(int distance) {
        if (distance < swimLimit) {
            return ("Собака " + name + " проплыл(а) " + distance + " метров при задданом лимите в  " + swimLimit + ".");
        } else {
            return ("Собака " + name + " проплыл(а) " + swimLimit + " метров при задданом лимите в " + swimLimit + ".");
        }

    }
}
