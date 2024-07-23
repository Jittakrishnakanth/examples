class Dog 
{
	String  name;
	String  breed;
	void bark()
	{
		System.out.println("BOW BOW!");
	}
}
class DogApp
{
public static void main(String[] args) 
	{
	Dog d1 = new Dog();
	d1.name = "Scooby";
	d1.breed = "pug";
	System.out.println("Details of Dog d1 :");
	System.out.println("Name :"+d1.name);
	System.out.println("Breed :"+d1.breed);
	d1.bark();
	Dog d2 = new Dog();
	d2.name = "pluto";
	d2.breed = "pitlecell";
	System.out.println("Details of Dog d2 :");
	System.out.println("Name :"+d2.name);
	System.out.println("Breed :"+d2.breed);
	d2.bark();
	}
}
