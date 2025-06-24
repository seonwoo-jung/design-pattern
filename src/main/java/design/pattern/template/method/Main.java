package design.pattern.template.method;

public class Main {

    public static void main(String[] args) {
        AbstractTemplate template = new SubClassLogic1();
        template.execute();
    }
}
