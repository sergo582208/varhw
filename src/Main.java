public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2() {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4 ;
        System.out.println(frog);

    }
    public static void task3() {
        var oneBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersWeight = oneBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + boxersWeight + "кг");


        var overload = (secondBoxerWeight - oneBoxerWeight)% boxersWeight;
        System.out.println("Разница в весе " + overload + " кг");

        var hoursTotal = 640;
        var hoursPerDay = 8;
        var numberOfPersons = hoursTotal/ hoursPerDay;
        System.out.println("Всего работников в компаниии " + numberOfPersons + " человек");
        var newComers = numberOfPersons + 94;
        var newHoursTotal = hoursTotal/newComers;
        System.out.println("Если в компании работает " + newComers + " человек" + ", то всего " + newHoursTotal + " часов работы может быть поделено между сотрудниками");
    }
}
