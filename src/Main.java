public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);
dog = dog + 4;
cat = cat + 4;
paper = paper + 4;
System.out.println(dog);
System.out.println(cat);
System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача номер 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача номер 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача номер 6,7
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weight = boxer1 + boxer2;
        System.out.println("Масса обоих бойцов равна " + weight + " кг!");
        var weight2 = boxer2 - boxer1;
        System.out.println("Разница в весе между бойцами равна " + weight2 + " кг!");
        var weight3 = boxer2 % boxer1;
        System.out.println("Остаток от деления равен " + weight3 + " кг!");
        // Задача номер 8
var hourWorker = 640;
var hour = 8;
var worker = hourWorker / hour;
System.out.println("Всего работников в компании - " + worker + " человек");
var workerNew = (hourWorker / hour) + 94;
var hourNew = workerNew * hour;
        System.out.println("Если в компании работает " + workerNew + " человек, то всего " + hourNew + " часов работы может быть поделено между сотрудниками.");
    }
}
