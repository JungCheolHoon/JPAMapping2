package kr.kwangan2.jpatest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "member")
public class MemberDetail {
	
	@Id
	@GeneratedValue
	@Column(name="MEMBER_DETAIL_ID")
	private Long seq;
	private String password;
	private String name;
	private String role;
	
	@OneToOne
	@JoinColumn(name="MEMBER_ID", nullable = false)
	private Member member;
	
	public void setMember(Member member) {
		this.member = member;
		member.setMemberDetail(this);
	}
	
}
