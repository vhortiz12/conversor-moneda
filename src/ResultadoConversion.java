import java.math.BigDecimal;
import java.math.RoundingMode;

public class ResultadoConversion {

    public static void mostrarResultado(BigDecimal montoDinero, String codigoBase, Moneda moneda) {

        if (moneda == null) {
            System.out.println("No se pudo realizar la conversión de moneda.");
            return;
        }

        // Utilizar BigDecimal para evitar notación científica y controlar el formato
        BigDecimal conversionResult = BigDecimal.valueOf(moneda.conversion_result()).setScale(2, RoundingMode.HALF_UP);

        System.out.println("-------------------------------------------------------------\n"
                + "El valor $" + montoDinero.setScale(2, RoundingMode.HALF_UP) + " [" + codigoBase + "]"
                + " corresponde al valor de --> $"
                + conversionResult + " [" + moneda.target_code() + "]"+
                "\n-------------------------------------------------------------");
    }

}
