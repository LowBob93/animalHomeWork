package Animal;

public abstract class Animal {
    protected String name;
    protected final int runLimit;
    protected int swimLimit;

    protected abstract String Run(int distance);

    protected abstract String Swim(int distance);

    protected abstract String runWithLimit(int distance);

    protected abstract String swimWithLimit(int distance);

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }


}
