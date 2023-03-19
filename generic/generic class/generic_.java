

class hello<E,T> {
    E weight;
    T name;
    hello(E x, T y){
        this.weight=x;
        this.name=y;
    }
    void print(){
        System.out.println("the value of weigth and height are "+weight+" "+ name);

    }
}

public class generic_ {
    public static void main(String[] args) {
        hello<Integer,String> obj=new hello<Integer,String>(34, "343");
        obj.print();
    }
}
