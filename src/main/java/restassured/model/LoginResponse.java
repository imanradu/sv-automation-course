package restassured.model;


import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("token")
    private String token;
    @SerializedName("refresh_token")
    private String refreshToken;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
