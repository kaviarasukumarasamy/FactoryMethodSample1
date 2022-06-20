
public class FactorySample {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();

		Animal animal1 = animalFactory.getAnimal("COW");
		animal1.setAge(3);

		Animal animal2 = animalFactory.getAnimal("RABBIT");
		animal2.setAge(2);

		Animal animal3 = animalFactory.getAnimal("HORSE");
		animal3.setAge(4);

		System.out.println(animal1.getAge());
		System.out.println(animal2.getAge());
		System.out.println(animal3.getAge());
	}

}
