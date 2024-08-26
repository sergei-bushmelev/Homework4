public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", нужно немного подождать");
        }
        System.out.println();

        //Задача 2
        int temp = 12;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println();

        //Задача 3
        int speed = 15;
        boolean tax = speed > 60;
        if (tax) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }
        System.out.println();

        //Задача 4
        int agePerson = 29;
        if (agePerson > 2 && agePerson < 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        }
        if (agePerson > 7 && agePerson < 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int ageChild = 19;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + ", можно кататься на аттракционе без сопровождении взрослого");
        }
        System.out.println();

        //Задача 6
        int passenger = 30;
        int totalCapacity = 102;
        if (passenger > totalCapacity) {
            System.out.println("вагон уже полностью забит");
        } else if (passenger > 60) {
            System.out.println("есть стоячие места");
        } else {
            System.out.println("есть стоячие и сидячие места");
        }
        System.out.println();

        //Задача 7
        int one = 7;
        int two = 22;
        int three = 1;
        boolean oneBiggest = one > two && one > three;
        boolean twoBiggest = two > one && two > three;
        if (oneBiggest) {
            System.out.println("число " + one + " самое большое");
        } else if (twoBiggest) {
            System.out.println("число " + two + " самое большое");
        } else {
            System.out.println("число " + three + " самое большое");
        }
    }
}