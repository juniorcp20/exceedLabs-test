public class q2 {
	// O padr�o de projeto utlizado � o Singleton.
	// Ele garante que existe somente uma inst�ncia de uma classe
	public static final q2 INSTANCE = new q2();

	private q2() {

	}

	public static q2 getInstance() {
		return q2.INSTANCE;
	}
}