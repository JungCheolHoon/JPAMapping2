package kr.kwangan2.jpatest;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.domain.Attach;
import kr.kwangan2.jpatest.domain.Board;
import kr.kwangan2.jpatest.domain.Member;
import kr.kwangan2.jpatest.domain.MemberDetail;
import kr.kwangan2.jpatest.domain.Reply;
import kr.kwangan2.jpatest.domain.Tag;
import kr.kwangan2.jpatest.repository.BoardRepository;
import kr.kwangan2.jpatest.repository.MemberRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class RelationMappingTest {
	@Autowired
	private MemberRepository memberRepo;

//	@Test
//	public void testInsert() {
//		for (int i = 0; i < 2; i++) {
//			Member member = new Member();
//			member.setId("member" + i);
//			MemberDetail detail = new MemberDetail();
//			detail.setPassword("detail" + i);
//			detail.setName("둘리" + i);
//			detail.setRole("User" + i);
//			detail.setMember(member);
//			for(int j=0; j<2;j++) {
//				Board board = new Board();
//				board.setTitle("둘리"+i+"가 등록한 게시글 " + j);
//				board.setContent("둘리"+i+"가 등록한 게시글 내용 " + j);
//				board.setCreateDate(new Date());
//				board.setCnt(0L);
//				board.setMember(member);
//				for(int k=0; k<2; k++) {
//					Tag tag = new Tag();
//					tag.setTagName("태그이름 "+k);
//					tag.setBoard(board);
//					tag.setMember(member);
//					
//					Attach attach = new Attach();
//					attach.setAttachName("첨부파일 이름 "+k);
//					attach.setAttachSize("파일 크기"+k);
//					attach.setBoard(board);
//					
//					Reply reply = new Reply();
//					reply.setContent("댓글내용 "+ i);
//					reply.setBoard(board);
//				}
//			}
//			memberRepo.save(member);
//		}
//	}

	
	@Test
	public void testDelete() {
		memberRepo.deleteById("member1");
	}
}
