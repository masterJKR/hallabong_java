package sangsog;

import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import common.Animal;

public class MainMethod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("복실이","진돗개"),
				new Cat("타이거"),
				new Rabbit("느림보"),
				new Bird("하늘의제왕")
		};
		
		for( Animal a : animals) {
			a.sound();
			a.sleep();
			
			if( a instanceof Dog)
				((Dog)a).getBreed();
			
			System.out.println();
		}

//		int a = (int)3.14f;
//		float f =24.5f;
//		System.out.println(  (int)f );
		
//		((Dog) animals[0]).getBreed();
//		
//		Dog dog = (Dog)animals[0];
//		
//		Dog d = new Dog("a","b");
//		Animal aa = d;
		
	}

}

//   Bird 클래스를 만드시오
//  짹짹 소리 나게 하시오 















