package pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Zeki";
		p.idade = 20;
		System.out.println(p.nome+" tem "+p.idade+" anos");
		p.aniversario();
		System.out.println("Agora "+p.nome+" tem "+p.idade+" anos");
	}

}
