package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{
}
