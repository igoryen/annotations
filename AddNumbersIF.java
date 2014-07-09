//v6
@WebService(targetNamespace = "http://duke.example.org",
        name = "AddNumbers")
@SOAPBinding(style = SOAPBinding.Style.RPC,
        use = SOAPBinding.Use.LITERAL)
public interface AddNumbersIF extends Remote {
 
    @WebMethod(operationName = "add", action = "urn:addNumbers")
    @WebResult(name = "return")
    public int addNumbers(@WebParam(name = "num1") int number1, 
                          @WebParam(name = "num2") int number2) throws 
            RemoteException, AddNumbersException;

}