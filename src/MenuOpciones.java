import java.io.IOException;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOpciones {

    private int opcion;
    private String codigoBase;
    private String codigoObjetivo;
    private BigDecimal montoDinero;

    public String getCodigoBase() {
        return codigoBase;
    }

    public String getCodigoObjetivo() {
        return codigoObjetivo;
    }

    public BigDecimal getMontoDinero() {
        return montoDinero;
    }

    public int getOpcion() {
        return opcion;
    }

    public void mostrarMenu() throws IOException, InterruptedException {
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String mensaje = """
                \n************************************************************
                
                Bienvenid@ al Conversor de Monedas
                
                A continuación presentamos las opciones de conversión:
                                
                1) Dólar americano [USD] --> Peso Colombiano [COP]
                2) Peso Colombiano [COP] --> Dólar Americano [USD]
                3) Dólar americano [USD] --> Peso Mexicano [MXN]
                4) Peso Mexicano [MXN] --> Dólar americano [USD]
                5) Peso Colombiano [COP] --> Peso Mexicano [MXN]
                6) Peso Mexicano [MXN] --> Peso Colombiano [COP]                
                7) Salir
                
                ************************************************************""";

        while (bandera) {
            System.out.println(mensaje);
            System.out.println("\nIngrese la opción que desea: ");

            try {
                this.opcion = teclado.nextInt();

                switch (this.opcion) {
                    case 1:
                        codigoBase = "USD";
                        codigoObjetivo = "COP";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI1 = new ConsultaAPI(this);
                        consultaAPI1.convertirMoneda();
                        break;
                    case 2:
                        codigoBase = "COP";
                        codigoObjetivo = "USD";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI2 = new ConsultaAPI(this);
                        consultaAPI2.convertirMoneda();
                        break;
                    case 3:
                        codigoBase = "USD";
                        codigoObjetivo = "MXN";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI3 = new ConsultaAPI(this);
                        consultaAPI3.convertirMoneda();
                        break;
                    case 4:
                        codigoBase = "MXN";
                        codigoObjetivo = "USD";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI4 = new ConsultaAPI(this);
                        consultaAPI4.convertirMoneda();
                        break;
                    case 5:
                        codigoBase = "COP";
                        codigoObjetivo = "MXN";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI5 = new ConsultaAPI(this);
                        consultaAPI5.convertirMoneda();
                        break;
                    case 6:
                        codigoBase = "MXN";
                        codigoObjetivo = "COP";
                        System.out.println("Ingrese el monto de dinero a convertir: ");
                        montoDinero = teclado.nextBigDecimal();
                        ConsultaAPI consultaAPI6 = new ConsultaAPI(this);
                        consultaAPI6.convertirMoneda();
                        break;
                    case 7:
                        System.out.println("Gracias por usar la aplicación¡");
                        bandera = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                teclado.next(); // Consumir la entrada no válida para evitar bucle infinito
            }
        }
    }

    }
