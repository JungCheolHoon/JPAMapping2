package kr.kwangan2.jpatest.repository;

import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpatest.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
