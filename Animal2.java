package krishna;

public class Animal2 {
void Move() {
System.out.println("A keep moving");
}
void Sleep() {
System.out.println("Sleep to relax");
}
class Herbivores extends Animal2
{
void eatPlants() {
System.out.println("An Animals eat plants");
}
class Carnivores extends Animal2
{
void eatAnimals() {
System.out.println("Carnivores eat Animal");
}
class Omnnivores extends Carnivores
{
void eatBoth() {
System.out.println("Omnivores eat Both Carnivores and Herbivores");
}
}
}
}
}
	

	


