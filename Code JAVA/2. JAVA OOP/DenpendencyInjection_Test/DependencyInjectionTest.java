public class DependencyInjectionTest {
    public static void main(String[] args) {
//        MyApplication app = new MyApplication();
//        app.processMassages("Hi Dien", "phankhacdien1110@gmail.com");
        String msg = "Hi Dien";
        String email = "phankhacdien1110@gmail.com";
        String phone = "0349128698";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //send Email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(msg, email);
    }
}
