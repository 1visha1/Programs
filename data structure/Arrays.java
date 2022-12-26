public class Arrays{

    public static void main(String...args){
        int [] marks;
        int size = 4;
        marks = new int[size];
        marks[0]=97;// phy
        marks[1]=98;//chem
        marks[2]=95;//eng
        marks[3]=89;//math

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        for(int i =0;i<4;i++){
            System.out.println(marks[i]);
        }

    }
}