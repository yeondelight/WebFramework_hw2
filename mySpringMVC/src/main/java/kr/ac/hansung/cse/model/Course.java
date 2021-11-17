package kr.ac.hansung.cse.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Course {
	
	@Override
	public String toString() {
		// ��ü�� �ִ� field ���� �Ѵ���
		return "Course [id=" + id + ", year=" + year + ", semester=" + semester + ", code=" + code + ", name=" + name
				+ ", type=" + type + ", professor=" + professor + ", credit=" + credit +  "]";
	}
	
	private int id;
	private int year;
	private int semester;
	private String code;
	
	@NotEmpty(message="Name cannot be empty")
	private String name;
	
	@NotEmpty(message="Type cannot be empty")
	private String type;
	
	@NotEmpty(message="Professor cannot be empty")
	private String professor;
	
	@NotNull(message="Credit cannot be empty")
	private int credit;

}
