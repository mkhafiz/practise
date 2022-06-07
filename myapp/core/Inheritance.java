package myapp.core;

public class Inheritance {

    public static void main(String[] args) {

        Comp firstComp = new Comp(5000, "Acer");        
        firstComp.on();

        Comp secondComp = new Comp(500); 
        secondComp.on();

        Super laptop = new Super();
        laptop.on();

    }
    
}
