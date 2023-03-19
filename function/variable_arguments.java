public class variable_arguments {
    static int sum(int ...arr){//this is variable argument
        int result=0;

        for(int x:arr){
            result+=x;
        }
        return result;
    }
    static int sum(int s){
        return s*5;
    }
    static int other(int x,int ...arr){
        return x+arr[0];
    }
    public static void main(String[] args) {
        System.out.println(sum(23,23,23,23,24,22,42,3));
        System.out.println(sum(34));
        System.out.println(other(4,6,78));
    }
}
