package vehicle;

public class HYUNDAI implements Car {

	@Override
	public void 시동(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]");
//		GasolineEngine engine = new GasolineEngine();
		engine.시동();
	}

	@Override
	public void 운행(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]");
//		GasolineEngine engine = new GasolineEngine();
		engine.운행();
	}

	@Override
	public void 정지() {
		// TODO Auto-generated method stub
		System.out.println("[Hyundai]");
	}

}
