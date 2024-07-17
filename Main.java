//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Book b = new Book("java", 22, "james");
//        Movie m = new Movie("scream", 12, "jhon hoe");
//        System.out.println("price is: " + b.getPrice());
//        b.Product();
//        System.out.println(b);
//        b.getDiscount();
//        System.out.println("************************************");
//        System.out.println(m);
//        System.out.println("price is: " + m.getPrice());
//        m.getDiscount();

//Q2

        MoveablePoint m = new MoveablePoint(7,5,4,3);
        System.out.println("Initial position: " + m);

        m.moveUp();
        System.out.println("After moving up: " + m);

        m.moveRighr();
        System.out.println("After moving right: " + m);

        m.moveDown();
        System.out.println("After moving down: " + m);

        m.moveLeft();
        System.out.println("After moving left: " + m);
    }
}