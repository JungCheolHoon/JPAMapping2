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
@ToString(exclude = "board")
public class Attach {

	@Id
	@GeneratedValue
	@Column(name = "ATTACH_ID")
	private Long seq;
	private String attachName;
	private String attachSize;
	
	@ManyToOne
	@JoinColumn(name="BOARD_ID", nullable = false)
	private Board board;
	
	public void setBoard(Board board) {
		this.board = board;
		board.getAttachList().add(this);
	}
	
}
