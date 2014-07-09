//v1

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HandlerChain {
    
    String file();

    @Deprecated String name() default "";

}