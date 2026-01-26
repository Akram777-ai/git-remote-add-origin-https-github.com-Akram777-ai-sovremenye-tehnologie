// --- КЛАССЫ НАСЛЕДОВАНИЯ ---

// Базовый класс Person (Задача 4) [cite: 17, 56]
class Person {
    String name; // Поле примитивного/ссылочного типа [cite: 24, 52]
    int age;     // Поле примитивного типа [cite: 25, 52]

    // Метод для вывода информации [cite: 17, 26]
    void displayInfo() {
        System.out.println("Имя: " + name); [cite: 27]
        System.out.println("Возраст: " + age); [cite: 28]
    }
}

// Производный класс Student (Задача 4) [cite: 18, 31, 56]
class Student extends Person {
    String group; // Дополнительное поле (Задача 4) [cite: 19, 32, 56]

    // Переопределение метода (Задача 5) [cite: 20, 33, 57]
    @Override
    void displayInfo() {
        super.displayInfo(); // Вызов метода базового класса [cite: 35]
        System.out.println("Группа: " + group); [cite: 36]
    }
}

// --- ГЛАВНЫЙ КЛАСС ---

public class Main {
    // Поле класса для демонстрации области видимости (Задача 3) [cite: 54]
    static String classField = "Я — поле класса (видна везде в классе)";

    public static void main(String[] args) {

        // --- ЗАДАЧА 1: Переменные и константы --- [cite: 49, 50]
        int count = 10;                // Примитивный тип
        double price = 99.99;          // Примитивный тип
        boolean isReady = true;        // Примитивный тип
        final int LIMIT = 100;         // Константа (final)

        System.out.println("Задача 1: " + count + ", " + price + ", " + isReady + ", " + LIMIT);

        // --- ЗАДАЧА 2: Примитивные и ссылочные типы --- [cite: 51, 52]
        int myAge = 20;                // Примитив (хранит значение)
        String myName = "Алексей";     // Ссылочный тип (объекты/строки)
        System.out.println("Задача 2: Примитив=" + myAge + ", Ссылка=" + myName);

        // --- ЗАДАЧА 3: Область видимости --- [cite: 53, 54]
        String localVariable = "Я — локальная переменная (видна только в методе)";
        System.out.println("Задача 3: " + classField);
        System.out.println("Задача 3: " + localVariable);

        // --- ЗАДАЧА 4 & 5: Наследование и Полиморфизм --- [cite: 21, 55, 58]
        // Создаем объект через ссылку базового класса (полиморфизм) [cite: 58]
        Person student = new Student();
        student.name = "Иван";         // Использование наследуемого поля [cite: 42]
        student.age = 20;              // Использование наследуемого поля [cite: 43]
        ((Student) student).group = "ИС-2204"; // Доступ к полю Student через приведение [cite: 44]

        System.out.println("\nРезультат работы (Задача 5):");
        student.displayInfo();         // Вызов переопределенного метода [cite: 45]
    }
}
