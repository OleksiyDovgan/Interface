public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on iPhone");
    }
}