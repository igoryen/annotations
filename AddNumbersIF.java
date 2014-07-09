//4
@WebService(targetNamespace = "http://duke.example.org",
        name = "AddNumbers")
public interface AddNumbersIF extends Remote {

    @WebMethod(operationName = "add", action = "urn:addNumbers")
    @WebResult(name = "return")
    public void addNumbers(@WebParam(name = "num1") int number1, 
                           @WebParam(name = "num2") int number2, 
                           @WebParam(name = "result",
            mode = WebParam.Mode.OUT) Holder<Integer> result) throws RemoteException, AddNumbersException;


}