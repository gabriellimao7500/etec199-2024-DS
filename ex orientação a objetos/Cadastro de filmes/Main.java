import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		ArrayList<Filme> filmes = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		
		Filme filme1 = new Filme();
		filme1.setNome("Os vingadores");
		filme1.setDuracao(142);
		System.out.println(filme1.exibirDuracaoEmHora());
		
		Filme filme2 = new Filme();
		filme2.setNome("Hotel Transilvania");
		filme2.setDuracao(93);
		System.out.println(filme2.exibirDuracaoEmHora());
		
		System.out.println("Por enquanto, Os filmes em cartaz são '"+ filme1.getNome() + "' e '" + filme2.getNome() + "'.");
		System.out.println();
		
		filmes.add(filme1);
		filmes.add(filme2);
		
		int i = 2;
		String resp = "s";
		while(resp.equalsIgnoreCase("s")) {
			filmes.add(cadastrarNovoFilme());
			System.out.println("Deseja cadastrar um novo filme?(S) para sim e (N) para não.");
			resp = in.next();
			i++;
		}
		System.out.println();
		System.err.println("Agora os filmes em cartaz são:");
		
		for(int j = 0; j < filmes.size(); j++) {
			String nome = filmes.get(j).getNome();
			int duracao = filmes.get(j).getDuracao();
			int [] tempo = filmes.get(j).exibirDuracaoEmHora();
			
			System.out.println("Filme: "+nome+", duração: "+tempo[0]+"h"+tempo[1]+", tempo em min: "+duracao+"\n-------------------------------------------------");
		}
		System.out.print("Programa encerrado!");
	}
	
	
	
	public static Filme cadastrarNovoFilme() {
		String nome;
		
		Scanner in = new Scanner(System.in);
		
		Filme filmes = new Filme();
		
		System.out.println("Insira o nome do filme");
		filmes.setNome(in.nextLine());
		nome = filmes.getNome();
		
		System.out.println("Insira o tempo de duração do filme em minutos: Exemplo(90) para um filme de 1h30");
		filmes.setDuracao(in.nextInt());
		
		
		int[] tempo = filmes.exibirDuracaoEmHora();
		System.out.println("O filme "+nome+" tem "+ tempo[0]+"h e "+tempo[1]+"m");
		
		
		return filmes;
	}
}