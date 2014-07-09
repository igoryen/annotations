//v1

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface WebResult {

    String name() default "return";

    String targetNamespace() default "";

    boolean header() default false;

    String partName() default "";
}