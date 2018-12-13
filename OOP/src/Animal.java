
public class Animal {

	private int legs;
	private boolean hasHorn;
	private boolean hasFur;
	private String habitat;
	
	public Animal(int legs, boolean hasHorn, boolean hasFur, String habitat) {
		this.legs = legs;
		this.hasHorn = hasHorn;
		this.hasFur = hasFur;
		this.habitat = habitat;
	}
	
	public Animal(String habitat) {
		this.legs = 4;
		this.hasHorn = false;
		this.hasFur = true;
		this.habitat = habitat;
	}

	
	public Animal() {
		this.legs = 4;
		this.hasHorn = false;
		this.hasFur = true;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isHasHorn() {
		return hasHorn;
	}

	public void setHasHorn(boolean hasHorn) {
		this.hasHorn = hasHorn;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Animal [No of legs = " + legs + ", Has horn? = " + hasHorn + ", Has fur? = " + hasFur + ", Habitat = " + habitat + "]";
	}
	
	

}
