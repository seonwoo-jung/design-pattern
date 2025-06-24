package design.pattern.template.callback;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.execute(new SubClassLogic1());
    }
}

