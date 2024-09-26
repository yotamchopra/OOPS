package encapsulation;
// Java Program to demonstrate
// Java Encapsulation

// Person Class
public class Person {

        // Encapsulating the name and age
        // only approachable and used using
        // methods defined
        private String name;
        private int age;

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }

        public void setAge(int age) { this.age = age; }
    }

