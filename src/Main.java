public class Main {
    public static void main(String[] args) {

        Hogwarts hogwartsStudent = new Hogwarts("Гарри Поттер", 95, 84);

        Gryffindor gryffindorStudent1 = new Gryffindor("Гарри Поттер", 95, 84,
                98, 97, 99);
        Gryffindor gryffindorStudent2 = new Gryffindor("Гермиона Грейнджер", 76, 90,
                89, 78, 77);
        Gryffindor gryffindorStudent3 = new Gryffindor("Рон Уизли", 65, 65,
                77, 67, 88);
        Hufflepuff hufflepuffStudent1 = new Hufflepuff("Захария Смит", 87, 54,
                88, 47, 69);
        Hufflepuff hufflepuffStudent2 = new Hufflepuff("Седрик Диггори", 88, 66,
                86, 87, 79);
        Hufflepuff hufflepuffStudent3 = new Hufflepuff("Джастин Финч-Флетчли", 65, 87,
                78, 68, 88);
        Ravenclaw ravenclawStudent1 = new Ravenclaw("Чжоу Чанг", 85, 74, 80,
                62, 45, 63);
        Ravenclaw ravenclawStudent2 = new Ravenclaw("Падма Патил", 77, 89, 85,
                88, 55, 88);
        Ravenclaw ravenclawStudent3 = new Ravenclaw("Маркус Белби", 89, 88, 97,
                88, 67, 55);
        Slytherin slytherinStudent1 = new Slytherin("Драко Малфой", 74, 84,
                94, 87, 79, 89, 99);
        Slytherin slytherinStudent2 = new Slytherin("Грэхэм Монтегю", 88, 88,
                88, 65, 70, 80, 45);
        Slytherin slytherinStudent3 = new Slytherin("Грегори Гойл", 55, 88,
                45, 88, 57, 45, 88);

        System.out.println(hogwartsStudent);

        System.out.println(gryffindorStudent1);
        System.out.println(hufflepuffStudent1);
        System.out.println(ravenclawStudent1);
        System.out.println(slytherinStudent1);

        System.out.println(gryffindorStudent1.compare(gryffindorStudent2));
        System.out.println(hufflepuffStudent1.compare(hufflepuffStudent2));
        System.out.println(ravenclawStudent1.compare(ravenclawStudent2));
        System.out.println(slytherinStudent1.compare(slytherinStudent2));

        System.out.println(gryffindorStudent1.compare(slytherinStudent1));

    }

}