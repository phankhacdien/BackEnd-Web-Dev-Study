public class MyApplication implements Consumer{
    private MessageService service;

    public MyApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessage(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.service.sendMassage(msg, rec);
    }
}
