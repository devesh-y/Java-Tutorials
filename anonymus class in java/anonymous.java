
//when you need only one object of a class then you dont want to create a new class , so you create a anonumous class

interface democlass{
    void meth1();
}

class reqclass implements democlass{
    public void meth1(){
        System.out.println("hello");
    }
}

//here you dont need to make the 'reqclass'

public class anonymous{
    public static void main(String[] args) {

        //as you created a anonymous class which implements democlass
        
        // anony class can implement only one interface at a time
        //can implemet a interface or extend a class, but not both
        //it have no constructos
        

        //you can create anonymous class from concrete or abstract class also
        //but you cannot define new methods here
        //you need to override the method like you did here
        democlass obj=new democlass(){
            public void meth1(){
                System.out.println("this is a method of anonymous class");
            }
        };

    }
}