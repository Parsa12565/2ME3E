import java.util.*;

public class LocalOffice implements ExamObservable,ExamObserver {
	
	private double gasPrice;
	private ArrayList<ExamObserver> stations;
	
	public LocalOffice(double gasPrice) {
		this.gasPrice=gasPrice;
		stations=new ArrayList<ExamObserver>(0);
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

	@Override
	public void update(double gasPrice) {
		this.gasPrice=gasPrice;
		pushUpdate();
	}
	
}
