
public class Runner {

	public static void main(String[] args) {
		HeadOffice HQ=new HeadOffice(10.00);
		LocalOffice LQ=new LocalOffice(HQ.gasPrice);
		LQ.add(new GasStation(LQ.gasPrice));
		HQ.add(LQ);
		HQ.add((new LocalOffice(HQ.gasPrice)));
		HQ.add(new GasStation(HQ.gasPrice));
		HQ.remove(LQ);
		HQ.setPrice(50.00);
	}

}
