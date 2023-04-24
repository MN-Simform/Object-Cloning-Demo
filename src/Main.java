class Rectangle{
    int length = 5;
    int breadth = 3;
}

public class Main {
    public static void main(String[] args) {
//        Shallow Copy
        Rectangle r1 = new Rectangle();
        Rectangle r2 = r1;

        System.out.println("Before Changing The Value Of Object R1, Object R2 Will Be");
        System.out.println("Length of R2 : " + r2.length + " And Breadth Of R2 : " + r2.breadth);

        r1.length = 10;
        r1.breadth = 3;
        System.out.println("After Changing Value Of Object R1, Object R2 Will Be");
        System.out.println("Length of R2 : " + r2.length + " And Breadth Of R2 : " + r2.breadth);
        System.out.println();

//        Deep Copy
        Rectangle r3 = new Rectangle();
        r3.length = r1.length;
        r3.breadth = r1.breadth;

        System.out.println("Before Changing The Value Of Object R1, Object R3 Will Be");
        System.out.println("Length Of R3 : " + r3.length + " And Breadth Of R3 : " + r3.breadth);

        r1.length = 20;
        r1.breadth = 5;
        System.out.println("After Changing The Value Of Object R1, Object R3 Will Be");
        System.out.println("Length Of R3 : " + r3.length + " And Breadth Of R3 : " + r3.breadth);

    }
}