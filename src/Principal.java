import java.io.IOException;

public class Principal {

    public static void main (String[] args) throws IOException, InterruptedException {

        MenuOpciones menuOpciones = new MenuOpciones();
        try {
            menuOpciones.mostrarMenu();
        }catch (IOException | InterruptedException e) {
            e.getMessage();
        }
    }

}
