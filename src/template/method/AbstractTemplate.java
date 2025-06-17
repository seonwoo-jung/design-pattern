package template.method;

public abstract class AbstractTemplate {

    public void execute() {
        System.out.println("공통로직 시작");
        call();
        System.out.println("공통로직 종료");
    }

    protected abstract void call();
}
