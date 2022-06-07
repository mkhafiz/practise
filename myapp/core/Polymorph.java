package myapp.core;

class Polymorph {
    static class Animal {
        public void animalSound() {
            System.out.println("Welcome to the farm");
        }
    }

    static class Duck {
        public void animalSound() {
            System.out.println("I like Duck");
        }
    }

    static class Geese {
        public void animalSound() {
            System.out.println("I like Geese");
        }
    }

    static class Cat {
        public void animalSound() {
            System.out.println("I like Cat");
        }
    }

    public static void main(String[] args) {

        Cat myCat = new Cat();
        Duck myDuck = new Duck();
        Geese mygGeese = new Geese();
        Animal msg = new Animal();

        msg.animalSound();
        myCat.animalSound();
        myDuck.animalSound();
        mygGeese.animalSound();

    }
}
