package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // Створюємо студента
        Student s = new Student("Анжеліка", 2);

        // Додаємо дисципліни
        s.addCourse("ООП");
        s.addCourse("ОБДЗ");
        s.addCourse("Теорія алгоритмів");
        s.addCourse("Теорія ймовірності");

        // Виводимо кількість дисциплін
        System.out.println(s.getName() + ": кількість вивчаємих дисциплін - " + s.getCourseCount());

        // Виводимо рік навчання
        System.out.println(s.getName() + ": рік навчання - " + s.getYear());

        // Виводимо скільки заплатив за навчання
        System.out.println(s.getName() + ": заплатив за навчання - " + s.getTuition() + " грн");
    }
}