//Simple inheritance
/* 
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Dog's own method
    }
}
*/
/*
//Multilevel inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); // Inherited method from Animal class
        puppy.bark(); // Inherited method from Dog class
        puppy.weep(); // Puppy's own method
    }
}
     */

//Hierarchical inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends
    Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Dog's own method

        Cat cat = new Cat();
        cat.eat(); // Inherited method from Animal class
        cat.meow(); // Cat's own method
    }
}
