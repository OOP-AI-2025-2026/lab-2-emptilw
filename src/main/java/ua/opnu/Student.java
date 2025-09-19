package ua.opnu;

public class Student {
    private String name;
    private int year;
    private String[] courses;  // масив для зберігання курсів
    private int courseCount;   // скільки курсів реально додано

    private static final int MAX_COURSES = 20; // максимальна кількість курсів

    // Конструктор
    public Student(String name, int year) {
        if (name == null || name.isEmpty()) {
            this.name = "Невідомий студент";
        } else {
            this.name = name;
        }

        if (year < 1 || year > 4) {
            this.year = 1;
        } else {
            this.year = year;
        }

        this.courses = new String[MAX_COURSES];
        this.courseCount = 0;
    }

    // Додати дисципліну
    public void addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty() && courseCount < MAX_COURSES) {
            courses[courseCount] = courseName;
            courseCount++;
        }
    }

    // Видалити всі дисципліни
    public void dropAll() {
        this.courses = new String[MAX_COURSES];
        this.courseCount = 0;
    }

    // Повертає кількість дисциплін
    public int getCourseCount() {
        return courseCount;
    }

    // Повертає ім’я студента
    public String getName() {
        return name;
    }

    // Повертає рік навчання
    public int getYear() {
        return year;
    }

    // Повертає суму грошей за навчання
    public int getTuition() {
        return year * 20000;
    }
}
