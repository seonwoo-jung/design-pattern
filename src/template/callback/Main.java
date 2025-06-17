package template.callback;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.call(new SubClassLogic1());
    }
}

