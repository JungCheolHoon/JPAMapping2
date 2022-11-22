package kr.kwangan2.jpatest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString(exclude = "boardList")
public class Member {
	@Id
	@Column(name="MEMBER_ID")
	private String id;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Board> boardList = new ArrayList<Board>();
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Tag> tagList = new ArrayList<Tag>();
	
	@OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
	private MemberDetail memberDetail;
	
}
