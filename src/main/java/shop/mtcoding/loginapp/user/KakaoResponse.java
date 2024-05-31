package shop.mtcoding.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

public class KakaoResponse {
    @Data
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private String expiresIn;
        private String scope; // 조심하자
        @JsonProperty("refresh_token_expires_in")
        private String refreshTokenExpiresIn;
    }

    @Data
    public static class KakaoUserDTO {
        private Long id;
        @JsonProperty("connected_at")
        private Timestamp connectedAt;
        private Properties properties;

        @Data
        class Properties {
            private String nickname;
        }
    }
//    POST: https://kauth.kakao.com/oauth/token
//    {
//        "access_token": "KsAP6xW-4FrPtsmoZo8JCVTCqMbnhEBjAAAAAQorDR8AAAGPzSvjgqhuWkW__Nqy",
//            "token_type": "bearer",
//            "refresh_token": "aq_eV7xJm03npLix0H510MtSljHsIz_iAAAAAgorDR8AAAGPzSvjf6huWkW__Nqy",
//            "expires_in": 21599,
//            "scope": "profile_nickname",
//            "refresh_token_expires_in": 5183999
//    }

//GET: https://kapi.kakao.com/v2/user/me
//    {
//        "id": 3506305387,
//            "connected_at": "2024-05-31T05:42:37Z",
//            "properties": {
//        "nickname": "장현정"
//    },
//        "kakao_account": {
//        "profile_nickname_needs_agreement": false,
//                "profile": {
//            "nickname": "장현정",
//                    "is_default_nickname": false
//        }
//    }
//    }
}
