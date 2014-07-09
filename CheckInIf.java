//v1

@WebService(name = "CheckIn")
public class CheckInIF {
    
    @WebMethod
    @OneWay
    public void checkIn(String name);

}