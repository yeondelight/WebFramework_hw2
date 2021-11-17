package kr.ac.hansung.cse.csemall;

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
	private String name;
	private String email;
	private String text;
	
	

}
