package org.tnsindia.builtinannotationdemo;




import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;




@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyCustom
{
	//abstract method
	String print();
	
}
class MyCustomAnnotation
{
	@MyCustom(print="CT2C-B35")
	public void display()
	{
		System.out.println("Make some nonsence");
	}
}
//driver class
public class customannotationdemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyCustomAnnotation m=new MyCustomAnnotation();
		m.display();
		Method m1=m.getClass().getMethod("display");
		MyCustom obj=m1.getAnnotation(MyCustom.class);
		System.out.println(obj.print());

	}

}
