package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {// 멤버 리포지토리 인터페이스
    Member save(Member member);// 멤버 객체를 받아 저장한다.
    Optional<Member> findById(Long Id);// 아이디를 받아 멤버를 조회한다.
    Optional<Member> findByName(String name);// 이름을 받아 멤버를 조회한다.
    List<Member> findAll();// 모든 멤버를 조회한다.
}
