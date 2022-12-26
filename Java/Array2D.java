public class Array2D{
    static void Display(int[][] a){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Marks["+i+"]["+j+"]: "+a[i][j]);
            }
        }
        
    }
    public static void main(String... ares){
        int[][] marks = new int[2][2];
        marks[0][0]=56;
        marks[0][1]=59;
        marks[1][0]=69;
        marks[1][1]=71;
        Display(marks);
    }
}
