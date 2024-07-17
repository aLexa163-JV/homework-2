public class Main {
    public static void main(String[] args) {

        //задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //задача №6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight + " кг");
        var difference = secondBoxer - firstBoxer;
        System.out.println(difference + " кг");

        //задача №7(тут у меня почему-то сомнения, не знаю правильно или нет)
        var remains = secondBoxer % firstBoxer;
        System.out.println(remains);

        //задача №8(1)
        var totalHours = 640;
        var everyWorker = 8;
        var totalWorkers = totalHours / everyWorker;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек.");

        //задача №8(2)
        var maxWorker = totalWorkers + 94;
        var maxHours = maxWorker * 8;
        System.out.println("Если в компании работает " + maxWorker + " человек, то всего " + maxHours + " часов работы может быть поделено между сотрудниками.");

    }
}