import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java", "Descrição Curso Java", 8);
		Curso curso2 = new Curso("Curso JavaScript", "Descrição Curso JavaScript", 10);
		DateTimeFormatter  dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição Mentoria de Java", LocalDate.parse("12/12/2022", dtf));
		Mentoria mentoria2 = new Mentoria("Mentoria de JavaScript", "Descrição Mentoria de JavaScript", LocalDate.parse("13/12/2022", dtf));
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);*/
		
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev devGabriel = new Dev("Gabriel");
		devGabriel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		devGabriel.progredir();
		System.out.println("Conteúdos Inscritos Gabriel: " + devGabriel.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Gabriel: " + devGabriel.getConteudosConcluidos());
		System.out.println("XP Gabriel: " + devGabriel.calcularTotalXp());
		System.out.println("");
		
		Dev devLuanna = new Dev("Luanna");
		devLuanna.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Luanna: " + devLuanna.getConteudosInscritos());
		devLuanna.progredir();
		devLuanna.progredir();
		System.out.println("Conteúdos Inscritos Luanna: " + devLuanna.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Luanna: " + devLuanna.getConteudosConcluidos());
		System.out.println("XP Luanna: " + devLuanna.calcularTotalXp());
		
	}
}
