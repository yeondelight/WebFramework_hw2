// PetOwner.java

package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {

	@Autowired	//wire by type
	@Qualifier(value="qf_rabbit")
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
