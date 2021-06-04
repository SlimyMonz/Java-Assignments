package lecture.week2.animals.species;

import lecture.week2.animals.Animal;

public class Dog extends Animal {

	public void walk() {
		System.out.println("Walks on all four legs!");
	}

	@Override
	public String makeSound() {
		return "woof";
	}

}
