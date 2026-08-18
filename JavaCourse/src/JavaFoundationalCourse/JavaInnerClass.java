package JavaFoundationalCourse;

//public class JavaInnerClass {
//    public static void main(String[] args) {
//        OutClass num1 = new OutClass();
//        OutClass.InnerClass num2 = num1.new InnerClass();
//        System.out.println(num1.a+num2.b);
//    }
//}
// class OutClass{
//    int a=10;
//    class InnerClass{
//        int b=20;
//    }
//}
//------------
//public class JavaInnerClass {
//    public static void main(String[] args) {
//        OutClass num1 = new OutClass();
//        OutClass.InnerClass num2 = num1.new InnerClass();
//        System.out.println(num1.a+"AND"+num2.InnerMethod());
//    }
//}
//class OutClass{
//    int a=10;
//    class InnerClass{
//        public int InnerMethod(){
//            System.out.println(a++);
//            return a;
//
//        }
//    }
//}
//------------
//
//------------
class fclass{
    public void display(){
        System.out.println("USEING fCLASS");
    }
}
class sclass{
    public void openplay() {
        fclass f1 = new fclass() {
            public void display() {
                System.out.println("USEING sclass");
            }
        };
        f1.display();
    }
}
class mainclass {
    public static void main(String[] args){
        sclass s1=new sclass();
        s1.openplay();
    }
}