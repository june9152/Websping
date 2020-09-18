package vehicle;

public class GasolineEngine implements Engine{
	
	@Override
	public void 시동() {
		System.out.println("[GasolineEngine]---시동을건다.");
	}
	@Override
	public void 운행() {
		System.out.println("[GasolineEngine]---운행한다.");
	}

}
