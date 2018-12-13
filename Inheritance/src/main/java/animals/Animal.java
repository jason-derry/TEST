package animals;

public abstract class Animal {
	
	private int bones;
	private int age;
	private String colour;
	private int size;
	private int weight;
	private String diet;
	private boolean hasLegs;
	private long cellCount;
	
	public abstract void eat();
	public abstract void shit();
	public abstract void move();
	public abstract void reproduce();

}
