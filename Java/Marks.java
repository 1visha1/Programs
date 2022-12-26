
import java.util.*;
public class Marks {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter marks of first sublject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter marks of second sublject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter marks of third sublject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter marks of fourth sublject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter marks of fifth sublject");
        marks[4] = sc.nextFloat();

        for(int i =  0; i<5;i++){
            System.out.println("Subject "+(i+1)+" marks: - "+marks[i]);
        }
    }
}
