// 静态内部类：
public OutClass(){
	int num1=10;
}
public InnerClass(){
	int num2=2;
}
public class MainClass{
public static void main(String[] args){
	OutClass numbers1=new OutClass();
	OutClass.InnerClass numbers2=new OutClass.InnerClass();
	System.out.println(numbers1.num1+numbers2.num2);
}
}
// 非静态内部类：

