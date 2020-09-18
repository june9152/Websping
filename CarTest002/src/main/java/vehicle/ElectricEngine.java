package vehicle;

public class ElectricEngine implements Engine{
	
	@Override
	public void 시동() {
		System.out.println("[ElectricEngine]---시동을건다.");
	}
	@Override
	public void 운행() {
		System.out.println("[ElectricEngine]---운행한다.");
	}

}
