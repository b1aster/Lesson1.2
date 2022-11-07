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
    }
}