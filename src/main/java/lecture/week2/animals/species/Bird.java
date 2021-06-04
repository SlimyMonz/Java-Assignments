package lecture.week2.animals.species;

import lecture.week2.animals.Animal;

public class Bird extends Animal {

	public void fly() {
		// flap wings
	}

	@Override
	public String makeSound() {
		return "Scree!";
	}

}
