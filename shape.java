abstract class shape {
    abstract void draw();
}

class Rectangle extends shape{
    void draw(){System.out.println("drawing rectangle");}
}

class Circle1 extends shape{
    void draw(){System.out.println("drawing circle");}
}

class testAbstraction1{
    public static void main(String args[]){
        shape s=new Circle1();
        s.draw();
    }
}