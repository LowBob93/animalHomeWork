package Animal;


import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        System.out.println("Home Work Lesson 6");
        System.out.println("_________________");
        animalCount(catArrayFill(), dogArrayFill());
    }

    public static int dogArrayFill() {
        Dog[] dog = new Dog[6];
        dog[0] = new Dog("Боня", 500, 10);
        dog[1] = new Dog("Джесси", 650, 20);
        dog[2] = new Dog("Бутч", 800, 35);
        dog[3] = new Dog("Ангри", 320, 15);
        dog[4] = new Dog("Тако", 440, 8);
        dog[5] = new Dog("Тралл", 400, 12);
        int dogCount = 0;
        for (int i = 0; i < dog.length; i++) {
            int runCount = 50 * i;
            int swimCount = 2 * i;
            String run = dog[i].Run(300 + runCount);
            String swim = dog[i].Swim(20 + swimCount);
            String limitRun = dog[i].runWithLimit(300 + runCount);
            String swimLimit = dog[i].swimWithLimit(5 + swimCount);
            System.out.println(run);
            System.out.println(swim);
            System.out.println(limitRun);
            System.out.println(swimLimit);
            System.out.println("________");
            dogCount++;
        }
        return dogCount;
    }

    public static int catArrayFill() {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Локи", 200, 0);
        cat[1] = new Cat("Клайд", 120, 0);
        cat[2] = new Cat("Алиса", 180, 0);
        int catCount = 0;
        for (int i = 0; i < cat.length; i++) {
            int runCount = 20 * i;
            String run = cat[i].Run(160 + runCount);
            String swim = cat[i].Swim(20);
            String limitRun = cat[i].runWithLimit(300 + runCount);
            String swimLimit = cat[i].swimWithLimit(5);
            System.out.println(run);
            System.out.println(swim);
            System.out.println(limitRun);
            System.out.println(swimLimit);
            System.out.println("________");
            catCount++;


        }
        return catCount;
    }

    public static void animalCount(int cats, int dogs) {
        System.out.println("Кошек всего " + cats);
        System.out.println("Собак всего " + dogs);
        int animalsAtAll = cats + dogs;
        System.out.println("Животных всего " + animalsAtAll);
    }
}

