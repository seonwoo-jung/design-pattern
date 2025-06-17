package template.method;

public class SubClassLogic1 extends AbstractTemplate {

    @Override
    protected void call() {
        System.out.println("변하는 로직 실행");
    }
}
