package kr.kwangan2.jpatest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = {"board","member"})
public class Tag {

	@Id
	@GeneratedValue
	@Column(name="TAG_ID")
	private Long seq;
	private String tagName;
	
	@ManyToOne
	@JoinColumn(name="BOARD_ID", nullable = false)
	private Board board;

	@ManyToOne
	@JoinColumn(name="MEMBER_ID", nullable = false)
	private Member member;
	
	public void setBoard(Board board) {
		this.board = board;
		board.getTagList().add(this);
	}
	
	public void setMember(Member member) {
		this.member = member;
		member.getTagList().add(this);
	}
	
}
