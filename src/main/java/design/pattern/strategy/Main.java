package design.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new SubClass());
        context.execute();
    }
}
