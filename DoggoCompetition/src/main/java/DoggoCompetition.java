
public class DoggoCompetition {

	private int placement;
	
	public DoggoCompetition(int placement) {
		this.placement = placement;
	}
	
	public void doggoPlacement() {
		for(int i = 1; i <= 100; i++) {
			if (placement == i)
				continue;
			switch (i) {
				case 11: 
					System.out.print(i + "th, ");
					break;
				case 12: 
					System.out.print(i + "th, ");
					break;
				case 13: 
					System.out.print(i + "th, ");
					break;
				case 99:
					if (placement == 100)
						System.out.print(i + "th");
					else
						System.out.print(i + "th, ");
					break;
				case 100: 
					System.out.print(i + "th");
					break;
				default:
					switch (i % 10) {
					case 1:
						System.out.print(i + "st, ");
						break;
					case 2:
						System.out.print(i + "nd, ");
						break;
					case 3:
						System.out.print(i + "rd, ");
						break;
					default:
						System.out.print(i + "th, ");
						break;
					}
			}
		}
		return;
	}
}
