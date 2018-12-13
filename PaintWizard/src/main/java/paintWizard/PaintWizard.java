package paintWizard;
import java.util.ArrayList;

public class PaintWizard {

	private ArrayList<Paint> paintList = new ArrayList<Paint>();

	public ArrayList<Paint> listAdd(Paint paint) {
		paintList.add(paint);
		return paintList;
	}
	
	public ArrayList<Paint> printList() {
		return paintList;
	}
	
	public ArrayList<Paint> leastWasteSqM(int roomSize) {
		ArrayList<Paint> leastWaste = new ArrayList<Paint>();
		leastWaste.add(paintList.get(0));
		int wasteCounter = 0;
		
		for(int i = 1; i < paintList.size(); i++) {
			int origList = paintList.get(i).getTotalCoverage();
			int newList = leastWaste.get(wasteCounter).getTotalCoverage();
			
			if (roomSize % newList == 0) {
				if (roomSize % origList == 0) {
					leastWaste.add(paintList.get(i));
					wasteCounter++;
				}
			} else {
				if (roomSize % origList == 0) {
					leastWaste.clear();
					leastWaste.add(paintList.get(i));
					wasteCounter = 0;
				} else if (origList - roomSize % origList < newList - roomSize % newList) {
					leastWaste.clear();
					wasteCounter = 0;
					leastWaste.add(paintList.get(i));
				} else if (origList - roomSize % origList == newList - roomSize % newList) {
					leastWaste.add(paintList.get(i));
					wasteCounter++;
				}
			}
		}
		return leastWaste;
	}
	
	public ArrayList<Paint> leastWasteL(int roomSize) {
		ArrayList<Paint> leastWaste = new ArrayList<Paint>();
		leastWaste.add(paintList.get(0));
		int wasteCounter = 0;
		
		for(int i = 1; i < paintList.size(); i++) {
			int origList = paintList.get(i).getTotalCoverage();
			int newList = leastWaste.get(wasteCounter).getTotalCoverage();
			double cap = paintList.get(i).getCapacity();
			double cap2 = leastWaste.get(wasteCounter).getCapacity();
			
			if ((roomSize % newList) / cap2 == 0) {
				if ((roomSize % origList) / cap == 0) {
					leastWaste.add(paintList.get(i));
					wasteCounter++;
				}
			} else {
				if (roomSize % origList / cap == 0) {
					leastWaste.clear();
					leastWaste.add(paintList.get(i));
					wasteCounter = 0;
				} else if ((origList - roomSize % origList) / cap2 < (newList - roomSize % newList) / cap) {
					leastWaste.clear();
					wasteCounter = 0;
					leastWaste.add(paintList.get(i));
				} else if ((origList - roomSize % origList) / cap2 == (newList - roomSize % newList) / cap) {
					leastWaste.add(paintList.get(i));
					wasteCounter++;
				}
			}
		}
		return leastWaste;
	}
	
	public ArrayList<Paint> cheapestPaint() {
		ArrayList<Paint> cheapestPaint = new ArrayList<Paint>();
		cheapestPaint.add(paintList.get(0));
		int counter = 0;
		
		for(int i = 1; i < paintList.size(); i++) {
			int origList = paintList.get(i).getTotalCoverage();
			int newList = cheapestPaint.get(counter).getTotalCoverage();
			if (origList/paintList.get(i).getCost() < newList/cheapestPaint.get(counter).getCost()) {
				cheapestPaint.clear();
				counter = 0;
				cheapestPaint.add(paintList.get(i));
			} else if (origList/paintList.get(i).getCost() == newList/cheapestPaint.get(counter).getCost()) {
				cheapestPaint.add(paintList.get(i));
				counter++;
			}
		}
		return cheapestPaint;
	}
	
	public void paintCost() {
		for (int i = 0; i < paintList.size(); i++) {
			System.out.println(paintList.get(i).getBrand() + " - " + paintList.get(i).getTotalCoverage()/paintList.get(i).getCost());
		}
	}
}

/*
if (roomSize % totalCoverage(i) == 0 && roomSize % totalCoverage(i-1) != 0) {
leastWaste.clear();
leastWaste.add(paintList.get(i));
}
else if (roomSize % totalCoverage(i) == 0 && roomSize % totalCoverage(i-1) == 0) {
leastWaste.add(paintList.get(i));
}
else if (totalCoverage(i) - roomSize % totalCoverage(i) < totalCoverage(i-1) - roomSize % totalCoverage(i-1) && roomSize % totalCoverage(i-1) != 0) {
leastWaste.clear();
leastWaste.add(paintList.get(i));
}
else if (totalCoverage(i) - roomSize % totalCoverage(i) == totalCoverage(i-1) - roomSize % totalCoverage(i-1) && roomSize % totalCoverage(i-1) != 0) {
leastWaste.add(paintList.get(i));
}
*/

/*	private int capacity(int x, ArrayList<Paint> list) {
int capacity = list.get(x).getCapacity();
return capacity;
}

private int coverage(int x, ArrayList<Paint> list) {
int coverage = list.get(x).getCoverage();
return coverage;
}

private int totalCoverage(int x, ArrayList<Paint> list) {
int totalCoverage = capacity(x,list) * coverage(x,list);
return totalCoverage;
}*/
