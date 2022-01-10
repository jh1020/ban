package ProjectA09;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setName2(String name) {
		this.setName(name);
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
	
}
