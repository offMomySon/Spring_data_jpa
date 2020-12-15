package study.datajpa.repository;

public class UsernameOnlyDto {

    private final String username;

    // 생성자의 param 이름으로 mapping 시킨다.
    // parameter 이름이 중요하다. param 이름을 분석해서 사용.
    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
