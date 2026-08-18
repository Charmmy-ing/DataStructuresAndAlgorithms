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
public class JavaInnerClass {
    public static void main(String[] args) {
        OutClass num1 = new OutClass();
        OutClass.InnerClass num2 = new OutClass.InnerClass();
        System.out.println(num1.b+"AND"+num2.InnerMethod());
    }
}
class OutClass{
    int b=10;
    static class InnerClass{
        public int InnerMethod(){
            int a=10;
            System.out.println(a++);
            return a;

        }
    }
}