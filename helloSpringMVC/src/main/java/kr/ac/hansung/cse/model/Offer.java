package kr.ac.hansung.cse.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Offer {
	
	@Override
	public String toString() {
		// ��ü�� �ִ� field ���� �Ѵ���
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
	private int id;
	
	@Size(min=2, max=100, message="Name must be between 2 and 100 chars")
	private String name;
	
	@Email(message="Please provide a valid email address")
	@NotEmpty(message="The email address cannot be empty")
	private String email;
	
	@Size(min=5, max=100, message="Text must be between 5 and 100 chars")
	private String text;

}
