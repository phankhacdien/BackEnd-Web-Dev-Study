public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMassage(String msg, String rec) {
        //logic to send SMS
        System.out.println("SMS send to: " + rec + " with message = " + msg);
    }
}
