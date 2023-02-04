package Type_Repeating_Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.ElementType; 

@Retention( RetentionPolicy.RUNTIME )
@Target(ElementType.METHOD)
@interface Custom {
	   int value();  
 }
class CustomAnnotationsrunner{
	   @Custom(value = 100)
	    public void method1() {
	        System.out.println("Custom Annotation");
	    }   
}
public class CustomAnnotations {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CustomAnnotationsrunner runner = new CustomAnnotationsrunner();
		  Method methods = runner.getClass().getMethod("method1");
		  Custom annotation = methods.getAnnotation(Custom.class);  
		  System.out.println("value is : "+ annotation.value());
	}
}
