package design.pattern.template.callback;

public class SubClassLogic1 implements Strategy {

    @Override
    public void call() {
        System.out.println("바뀌는 로직 실행");
    }
}
