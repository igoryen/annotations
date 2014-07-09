//v1

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface SOAPBinding {
    
    public enum Style {
        DOCUMENT,
        RPC,
    }

    public enum Use {
        LITERAL,
        ENCODED,
    }

    public enum ParameterStyle {
        BARE,
        WRAPPED,
    }

    Style style() default Style.DOCUMENT;

    Use use() default Use.LITERAL;

    ParameterStyle parameterStyle() default ParameterStyle.WRAPPED;

}