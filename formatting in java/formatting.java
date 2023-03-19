public class formatting {
    public static void main(String[] args) {
        String s = String.format("i have this much %,d of money", 1000000000);
        //comma is used to represent the ruppee criteria of thousands
        

        System.out.println(s);
    }
}
