//v1

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BindingType {
    /**
     * A binding identifier (a URI).
     * If not specified, the default is the SOAP 1.1 / HTTP
     * binding.
     * <p/>
     * See the
     * SOAPBinding and
     * HTTPBinding
     * for the definition of the standard binding identifiers.
     *
     * @see javax.xml.ws.Binding
     * @see javax.xml.ws.soap.SOAPBinding#SOAP11HTTP_BINDING
     * @see javax.xml.ws.soap.SOAPBinding#SOAP12HTTP_BINDING
     * @see javax.xml.ws.http.HTTPBinding#HTTP_BINDING
     */
    String value() default "";

    /**
     * An array of Features to enable/disable on the specified
     * binding.
     * If not specified, features will be enabled/disabled based
     * on their own rules. Refer to the documentation of the
     * feature
     * to determine when it will be automatically enabled.
     * <p/>
     * See the
     * SOAPBinding
     * for the definition of the standard feature identifiers.
     *
     * @see javax.xml.ws.RespectBindingFeature
     * @see javax.xml.ws.soap.AddressingFeature
     * @see javax.xml.ws.soap.MTOMFeature
     * @since JAX-WS 2.1
     */
    Feature[] features() default {};
}