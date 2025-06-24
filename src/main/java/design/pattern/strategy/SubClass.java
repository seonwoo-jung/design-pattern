package design.pattern.strategy;

public class SubClass implements Strategy {
    @Override
    public void call() {
        System.out.println("변하는 코드 호출");
    }
}
