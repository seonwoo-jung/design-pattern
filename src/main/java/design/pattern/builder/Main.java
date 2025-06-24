package design.pattern.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .username("seonwoo_jung")
                .email("seonwoo@example.com")
                .age(26)
                .phone("010-1234-5678")
                .build();

        System.out.println(user);
    }
}
