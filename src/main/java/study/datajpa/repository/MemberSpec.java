package study.datajpa.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import study.datajpa.entity.Member;
import study.datajpa.entity.Team;

import javax.persistence.criteria.*;

public class MemberSpec {

    //team 의 이름을 검색조건으로 넣을 것이다.
    public static Specification<Member> teamName(final String teamName) {
        return (Specification<Member>) (root, query, criteriaBuilder) -> {
            if(StringUtils.isEmpty(teamName)){
                return null;
            }

            //회원과 조인
            Join<Member, Team> t = root.join("team",JoinType.INNER);
            return criteriaBuilder.equal(t.get("name"), teamName);
        };
    }

    public static Specification<Member> username(final String username) {
        return (Specification<Member>) (root, query, criteriaBuilder) -> {
            return criteriaBuilder.equal(root.get("username"), username);
        };
    }
}

