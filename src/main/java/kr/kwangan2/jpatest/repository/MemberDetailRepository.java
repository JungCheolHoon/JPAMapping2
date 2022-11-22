package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.MemberDetail;

public interface MemberDetailRepository extends CrudRepository<MemberDetail, Long>{

}
