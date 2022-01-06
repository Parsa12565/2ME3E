import java.util.*;

public class HeadOffice implements ExamObservable {
	
	private double gasPrice;
	private ArrayList<ExamObserver> stations;
	
	public HeadOffice(double gasPrice) {
		this.gasPrice=gasPrice;
		stations=new ArrayList<ExamObserver>(0);
	}
	
	public void setPrice(double gasPrice) {
		this.gasPrice=gasPrice;
		pushUpdate();
	}
	
	@Override
	public void add(ExamObserver station) {
		stations.add(station);
	}

	@Override
	public void remove(ExamObserver station) {
		stations.remove(station);
	}

	@Override
	public void pushUpdate() {
		ListIterator<ExamObserver> i=stations.listIterator();
		while(i.hasNext())
			i.next().update(gasPrice);
	}

}
