public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMassage(String msg, String rec) {
        //logic to send Email
        System.out.println("Email send to: " + rec + " with message = " + msg);
    }
}
