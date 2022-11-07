public class Main {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8;
        System.out.println(dog);

        var cat = 3.6f;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        // Разделитель
        System.out.println();

        // Задание 2
        dog += 4;
        System.out.println(dog);

        cat += 4;
        System.out.println(cat);

        paper += 4;
        System.out.println(paper);

        // Разделитель
        System.out.println();

        // Задание 3
        dog -= 3.5f;
        System.out.println(dog);

        // Из условия задачи неизвестно требуется ли уменьшить значение с преобразованием типа
        /*
            var newDog = dog - 3.5f;
            System.out.println(newDog);
         */

        cat -= 1.6f;
        System.out.println(cat);

        paper -=  7639;
        System.out.println(paper);

        // Разделитель
        System.out.println();

        // Задание 4
        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);

        // Разделитель
        System.out.println();

        // Задание 5
        var frog = 3.5f;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5f;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

        // Разделитель
        System.out.println();

        // Задание 6
        var firstBoxerWeight = 78.2f;
        var secondBoxerWeight = 82.7f;

        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalBoxersWeight + " кг.");

        var differenceBoxersWeight = (secondBoxerWeight > firstBoxerWeight) ? secondBoxerWeight % firstBoxerWeight : firstBoxerWeight % secondBoxerWeight;
        System.out.println("Разница между весами боксеров " + differenceBoxersWeight + " кг.");

        // Разделитель
        System.out.println();

        // Задание 7
        var differenceBoxersWeightDiv = (secondBoxerWeight > firstBoxerWeight) ? secondBoxerWeight - firstBoxerWeight : firstBoxerWeight - secondBoxerWeight;
        System.out.println("Разница между весами боксеров " + differenceBoxersWeightDiv + " кг.");

        var differenceBoxersWeightRmd = (secondBoxerWeight > firstBoxerWeight) ? secondBoxerWeight % firstBoxerWeight : firstBoxerWeight % secondBoxerWeight;
        System.out.println("Разница между весами боксеров " + differenceBoxersWeightRmd + " кг.");

        // Разделитель
        System.out.println();

        // Задание 8
        var totalHours = 640;
        var hoursPerDay = 8;

        var totalEmployees = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек");

        var newTotalEmployees = totalEmployees + 94;
        var newTotalHours = newTotalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " + newTotalHours + " час(а/ов) работы может быть поделено между сотрудниками");
    }
}