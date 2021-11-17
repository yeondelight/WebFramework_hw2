// Rabbit.java

package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Rabbit implements AnimalType {

	private String myName;

	@Override
	public void sound() {
		System.out.println("Rabbit name = " + myName + ":" + "squeak");
	}
	
}
