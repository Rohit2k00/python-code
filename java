// 9. Try-catch for error handling
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Division by zero is not allowed!");
}

// 10. Inheritance
class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
Animal animal = new Dog();
animal.makeSound();

// 11. Interfaces
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}
Flyable flyable = new Bird();
flyable.fly();

// 12. Enumerations
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
Day today = Day.MONDAY;
System.out.println(today);

// 13. String manipulation
String greeting = "Hello";
String name = "John";
String message = greeting + ", " + name;
System.out.println(message);

// 14. User input
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String userInput = scanner.nextLine();
System.out.println("Hello, " + userInput);

// 15. Random number generation
import java.util.Random;
Random random = new Random();
int randomNumber = random.nextInt(100);
System.out.println(randomNumber);

// 16. Formatting strings
String formattedString = String.format("My name is %s and I am %d years old.", "Alice", 25);
System.out.println(formattedString);

// 17. ArrayList
import java.util.ArrayList;
ArrayList<Integer> numbersList = new ArrayList<>();
numbersList.add(1);
numbersList.add(2);
numbersList.add(3);
System.out.println(numbersList);

// ... and so on until line 100.
