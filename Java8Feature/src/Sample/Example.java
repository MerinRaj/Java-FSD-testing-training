package Sample;

interface MyInterface1{
    default void newDefaultMethod(){
        System.out.println("New default method");
    }
    static void newStaticMethod(){
        System.out.println("New static method");
    }
    void existingMethod(String str);
}
public class Example implements MyInterface1 {
    //existing method implementation
    public void existingMethod(String str){
        System.out.println("String : "+str);
    }
    //There is no need to implement the other methods
    public static void main(String args[]) {
        
        Example obj = new Example();
        
        obj.newDefaultMethod();
        MyInterface1.newStaticMethod();
        obj.existingMethod("This is the new java 8 feature");
    }
}

