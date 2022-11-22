package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.MemberDetail;
import kr.kwangan2.jpatest.domain.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{

}
