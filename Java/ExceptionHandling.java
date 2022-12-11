public class ExceptionHandling {
    public static void main(String... args) {
        try {
          int a=1/+1;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}
