// calculating volume of room using constroucto
import java.util.*;

public class VolumeOfRoom{
    float length =0;
    float hieght =0;
    float breadth =0;
    VolumeOfRoom(float l, float h,float b){
        length = l;
        hieght = h;
        breadth = b;
    }
    float volume(){
        return(length*hieght*breadth);
    }
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght of room: -");
        float l = sc.nextFloat();
        System.out.println("Enter height of room: -");
        float h = sc.nextFloat();
        System.out.println("Enter breadth of room: -");
        float b = sc.nextFloat();
        VolumeOfRoom room = new VolumeOfRoom(l, h, b);
        System.out.println(room.volume());
    }
}
