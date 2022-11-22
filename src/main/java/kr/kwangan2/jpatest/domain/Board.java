package kr.kwangan2.jpatest.domain;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude="member")
public class Board {
	@Id
	@GeneratedValue
	@Column(name="BOARD_ID")
	private Long seq;
	private String title;
//	private String writer;
	private String content;
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date createDate;
	private Long cnt;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID", nullable = false)
	private Member member;
	
	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<Tag> tagList = new ArrayList<Tag>();

	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<Attach> attachList = new ArrayList<Attach>();

	@OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
	private List<Reply> replyList = new ArrayList<Reply>();
	
	public void setMember(Member member) {
		this.member = member;
		member.getBoardList().add(this);
	}
}
