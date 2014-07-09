//v1

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface WebParam {

    public enum Mode {
        IN,
        OUT,
        INOUT
    }

    String name() default "";

    String targetNamespace() default "";

    Mode mode() default Mode.IN;

    boolean header() default false;

    String partName() default "";
}