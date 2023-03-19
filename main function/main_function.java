//a main function has to be defined in a java program
//to tell it where it should start execution


//let say you define a function func in the class having main function then


public class main_function {


    //either you make the function as static 
    static void func(){
        System.out.println("in func");
    }
    public static void main(String[] args) {

        func(); // so that you can use it in the main function
        //because if we dont use static then 
        //we have to create a object of this class as
        main_function hello =new main_function();
        hello.func();
    }
}
//same thing for data member

// i know you are creating object of same class in which you are working 
//but it has to be done because main function has to be defined to tell JVM to start execution



//i know in if we define an another class here
//then you can use the function and members wherever within in that class
//but here the main function class has to be made like this
