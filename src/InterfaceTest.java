interface I{
    public abstract void play();
}
class A{
    public void methodA(I i){
        i.play();
    }
}
class B implements I{
    public void play(){
        System.out.println("B");
    }
}
class C implements I{
    public void play(){
        System.out.println("C");
    }
}


public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.methodA(new B());
        a.methodA(new C());
    }
}

////////1
//class A{
//    public void methodA(B b){
//        b.methodB();
//    }
//}
//class B{
//    public void methodB(){
//        System.out.println("B");
//    }
//}
//
//
//public class InterfaceTest {
//    public static void main(String[] args){
//        A a = new A();
//        a.methodA(new B());
//    }
//}
