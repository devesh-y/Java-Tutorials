
public class exception_handling {
    public static void main(String[] args) {
        
        try{
            int c=43/0;
        
        }
        catch(Exception e){
            System.out.println("erro occured");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    

    }
}
