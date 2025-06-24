package design.pattern.builder;

public class User {
    // 필수 파라미터
    private final String username;

    // 선택 파라미터
    private final String email;
    private final int age;
    private final String phone;

    // private 생성자
    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    // 정적 내부 클래스 Builder
    public static class Builder {
        private final String username;  // 필수 파라미터

        private String email = "";
        private int age = 0;
        private String phone = "";

        public Builder(String username) {
            this.username = username;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // toString() for debugging
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
