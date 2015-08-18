public class q2 {
	// O padrão de projeto utlizado é o Singleton.
	// Ele garante que existe somente uma instância de uma classe
	public static final q2 INSTANCE = new q2();

	private q2() {

	}

	public static q2 getInstance() {
		return q2.INSTANCE;
	}
}