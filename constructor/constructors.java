class employee{
    int a;
    int b;
    employee(int a,int b){
        this.a=a;
        this.b=b;
    }
    void printdetails(){
        System.out.println(a+" "+b);
    }
    
}

public class constructors {
    public static void main(String[] args) {
        employee obj=new employee(5,34);
        obj.printdetails();
      
    }
}
