import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 8);
		Curso curso2 = new Curso("Curso JavaScript", "Descrição Curso JavaScript", 10);
		DateTimeFormatter  dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição Mentoria de Java", LocalDate.parse("12/12/2022", dtf));
		Mentoria mentoria2 = new Mentoria("Mentoria de JavaScript", "Descrição Mentoria de JavaScript", LocalDate.parse("13/12/2022", dtf));
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);

	}
}
