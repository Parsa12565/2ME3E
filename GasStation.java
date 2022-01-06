
public class GasStation implements ExamObserver {

	private double gasPrice;
	
	public GasStation(double gasPrice) {
		this.gasPrice=gasPrice;
	}
	
	@Override
	public void update(double gasPrice) {
		this.gasPrice=gasPrice;
	}

}
