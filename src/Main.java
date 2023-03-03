import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(); //Criando uma nova instância da classe curso.
        course.setTitle("Curso Java");
        course.setDescription("Curso Java");
        course.setWorkload(40);

        Mentoring mentoring = new Mentoring();
        mentoring.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(mentoring);
    }
}