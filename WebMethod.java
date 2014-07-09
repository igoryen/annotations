//1
@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface WebMethod {
    String operationName() default "";

    String action() default "";

    boolean exclude() default false;
}