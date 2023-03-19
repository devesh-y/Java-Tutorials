//you cannot send the primitive data types as reference in java
//but can be done in c++
public class pass_by_reference {
    static void func(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*3;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        func(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
