package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

// interface 기반의 projection 이라 불린다.
public interface UsernameOnly {

//      close project | string 만 가져온다.
//      String getUsername();


    // open project. | Member Entity 를 가져오고 그중에서 필요한 값만 셋팅한다.
    // Spel 문법.
    // target 은 Member
    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
