// 1. Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Variables and basic arithmetic
int x = 10;
int y = 5;
int z = x + y;
System.out.println(z);

// 3. Conditional statements
if (z > 15) {
    System.out.println("Greater than 15");
} else if (z == 15) {
    System.out.println("Equals 15");
} else {
    System.out.println("Less than 15");
}

// 4. Loops
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// 5. Functions
int square(int num) {
    return num * num;
}
System.out.println(square(3));

// 6. Arrays
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}

// 7. Classes and objects
class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println("Woof!");
    }
}
Dog dog1 = new Dog("Buddy", 2);
System.out.println(dog1.name);
dog1.bark();

// 8. File I/O
import java.io.*;

try {
    FileWriter writer = new FileWriter("sample.txt");
    writer.write("Hello, this is a sample text.");
    writer.close();

    BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
    String content = reader.readLine();
    System.out.println(content);
    reader.close();
} catch (IOException e) {
    e.printStackTrace();
