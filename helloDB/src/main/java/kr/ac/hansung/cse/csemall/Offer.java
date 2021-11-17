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
		// °´Ã¼¿¡ ÀÖ´Â field °ªÀ» ÇÑ´«¿¡
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
	
	private int id;
	private String name;
	private String email;
	private String text;
	
	

}
