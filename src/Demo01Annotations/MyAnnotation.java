package Demo01Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // can be applied only on methods
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	int value();

	// String a;
	String a();

}
