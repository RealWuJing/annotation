import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Test2 {
}

@Test2
class A {
}

public class B extends A {
}