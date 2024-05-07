import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Developer;
import br.com.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp aa");
        bootcamp1.setDescription("Descrição ...");

        Course course1 = new Course();
        course1.setTitle("Java 1");
        course1.setDescription("Java 111");
        course1.setWorkload(3);

        Course course2 = new Course();
        course2.setTitle("JS 1");
        course2.setDescription("JS 111");
        course2.setWorkload(2);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Java Work");
        mentoring1.setDescription("Java work ...");
        mentoring1.setDate(LocalDate.of(2024, 5, 18));

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setTitle("JS Work");
        mentoring2.setDescription("JS work ...");
        mentoring2.setDate(LocalDate.of(2024, 5, 15));

        bootcamp1.setContents(course1);
        bootcamp1.setContents(course2);
        bootcamp1.setContents(mentoring2);

        Developer dev1 = new Developer();
        dev1.setName("Jean");
        dev1.registerBootcamp(bootcamp1);

        System.out.println(dev1.getSubscribeContents());

        dev1.toProgress();
        System.out.println("-----");
        System.out.println(dev1.getSubscribeContents());
        System.out.println(dev1.getCompletedContents());

    }
}