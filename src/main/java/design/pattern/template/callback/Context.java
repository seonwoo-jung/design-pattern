package design.pattern.template.callback;

public class Context {

    public void execute(Strategy strategy) {
        System.out.println("바뀌지 않는 부분 실행");
        strategy.call();
        System.out.println("바뀌지 않는 부분 실행");
    }
}
