public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        adaptee.performAction();

        Adapter target = new Adapter(adaptee);
        target.doSomething();
    }
}
