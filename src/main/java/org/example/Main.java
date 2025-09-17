package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Circle circle= new Circle(7);
Rectangle rectangle= new Rectangle(10,5);
Triangle triangle=new Triangle(4,7);

        System.out.println("circle area: "+circle.calculateArea());
        System.out.println("circle area: "+rectangle.calculateArea());
        System.out.println("circle area: "+triangle.calculateArea());

    }
}