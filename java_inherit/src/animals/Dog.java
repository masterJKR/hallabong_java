package animals;

import common.Animal;

public class Dog extends Animal{
	
	private String breed; // 견종
	
	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	// DOG 클래스 전용
	public void getBreed() {
		System.out.println( breed );
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
