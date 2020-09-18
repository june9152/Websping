package vehicle;

public class TESLA implements Car {

	@Override
	public void 시동(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("[TESLA]");
//		ElectricEngine engine = new ElectricEngine();
		engine.시동();
	}

	@Override
	public void 운행(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("[TESLA]");
//		ElectricEngine engine = new ElectricEngine();
		engine.운행();
	}

	@Override
	public void 정지() {
		// TODO Auto-generated method stub
		System.out.println("[TESLA]---정지한다.");
	}

}
