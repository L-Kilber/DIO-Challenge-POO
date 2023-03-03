import br.com.dio.challenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(); //Criando uma nova instância da classe curso.
        course.setName("Curso Java");
        course.setDescription("Curso Java");
        course.setWorkload(40);

        Mentoring mentoring = new Mentoring();
        mentoring.setName("Mentoria Java");
        mentoring.setDescription("Essa é uma mentoria sobre Java");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp de Java básico");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(mentoring);

        Dev devLayson = new Dev();
        devLayson.setName("Layson");
        devLayson.signUpBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devLayson.getSignedContent());
        devLayson.progress();
        System.out.println("XP total: " + devLayson.calculateTotalXP());
        System.out.println("Conteúdos Inscritos: " + devLayson.getSignedContent());
        System.out.println("Conteúdos Completos: " + devLayson.getCompletedContent());
    }
}