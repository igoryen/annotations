//v1

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface WebService {
    String name() default "";

    String targetNamespace() default "";

    String serviceName() default "";

    String wsdlLocation() default "";

    String endpointInterface() default "";

    String portName() default "";
}