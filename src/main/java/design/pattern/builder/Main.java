package design.pattern.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("jeongseonwoo")
                .email("seonwoo@example.com")
                .age(26)
                .phone("010-1234-5678")
                .build();

        System.out.println(user);
    }
}
