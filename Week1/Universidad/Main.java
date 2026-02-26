

/**
 * Class Main
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Profesores se crean primero (existen independientemente)
        Profesor p1 = new Profesor("adsoftito", "Principios");
        Profesor p2 = new Profesor("gabriel", "IA");

        List<Profesor> listaProfesores = new ArrayList<>();
        listaProfesores.add(p1);
        listaProfesores.add(p2);

        // Universidad recibe profesores ya creados
        Universidad universidad = new Universidad("USBI", listaProfesores);

        universidad.mostrarProfesores();
    }
}
