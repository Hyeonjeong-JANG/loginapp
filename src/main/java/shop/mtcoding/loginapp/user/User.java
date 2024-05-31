package shop.mtcoding.loginapp.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "user_tb")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    private String provider; // facebook, kakao, apple, naver -> 이게 들어갔다는 것은 오어스로 로그인 했다는 뜻이다.

    @Builder
    public User(Integer id, String username, String password, String email, String provider) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.provider = provider;
    }
}
