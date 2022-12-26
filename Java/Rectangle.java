public class Rectangle {

    int length,breadth;
    Rectangle(){
        System.out.println("Default Constructor");
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        return (length*breadth);
    }
    public static void main(String... args){
        Rectangle a = new Rectangle(45,40);
        System.out.println("Area of Rectangle = "+a.area());
    }

}
