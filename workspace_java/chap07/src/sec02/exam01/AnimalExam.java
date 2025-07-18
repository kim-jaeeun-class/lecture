package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.think();
		a1.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.clean();
		cat.grooming();
		
		System.out.println("형 변환 실행");
		Animal a2 = (Animal)cat;	// 자식이 부모가 될 때,
		Animal a3 = cat;			// 형 변환 연산자 생략 가능(자동 형 변환)
		
		// 이 코드는 정상 실행
		a2.eat();
		// 부모가 없으므로 아래는 undefined됨
//		a2.clean();
		
		Dog dog = new Dog();
		Animal a5 = dog;
		// 위와 아래는 같은 의미		
		Animal a4 = new Dog();
		
		// static void catMom에서
		// static을 안 붙이면 오류 발생
		System.out.println("static 관련");
		catMom(cat);
		// 이렇게는 사용 가능
//		newAnimalExam().catMom(cat);
		
		// 이렇게 가능 : 이유 - Animal 타입이기 때문에
		animalCare(a4);
		animalCare(new Cat());
	}
	
	static void catMom(Cat cat) {
		cat.eat();
		cat.grooming();
		cat.clean();
	}
	
	static void animalCare(Animal animal) {
		System.out.println("Age is : " + animal.age);
		animal.eat();
		animal.think();
	}

}
