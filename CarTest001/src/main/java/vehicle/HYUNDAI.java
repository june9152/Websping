package vehicle;

public class HYUNDAI implements Car {

	@Override
	public void 시동() {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]---시동을건다.");
	}

	@Override
	public void 운행() {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]---운행한다.");
	}

	@Override
	public void 정지() {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]---정지한다.");
	}

}
