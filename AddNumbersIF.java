//2
@WebService(targetNamespace = "http://duke.example.org",
        name = "AddNumbers")
public interface AddNumbersIF extends Remote {

    @WebMethod(operationName = "add", action = "urn:addNumbers")
    public int addNumbers(int number1, int number2) throws 
            RemoteException, AddNumbersException;

}