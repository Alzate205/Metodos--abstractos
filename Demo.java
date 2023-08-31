abstract class AbstractDemo {
    public void myMethod(){
        System.out.println("Hello");
    }
    final public void myMethod2(){
        System.out.println("Saludo");
    }
    abstract public void anotherMethod();
}
public class Demo extends AbstractDemo{
    public void anotherMethod() {
        System.out.println("Abstract method");
    }
    public static void main(String args[]){
        AbstractDemo obj = new AbstractDemo();
            obj.anotherMethod();

            }
        }





