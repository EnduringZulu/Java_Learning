
public class Human {
	String name;
	int age;
	double weight;
	Human(String name, int age, double weight){
		//To assign name = name
		this.name = name;
		//To assign age = age
		this.age = age;
		//To assign weight = weight
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	void drink() {
		System.out.println(this.name + " is drinking");
	}
}
