package design.pattern.strategy;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println("변하지 않는 코드 호출");
        strategy.call();
        System.out.println("변하지 않는 코드 호출");
    }
}
