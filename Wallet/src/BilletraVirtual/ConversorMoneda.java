package BilletraVirtual;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase ConversorMoneda implementa la interfaz OperacionesMoneda para convertir entre diferentes monedas.
 */
public class ConversorMoneda implements OperacionesMoneda {
    // Atributos de la clase
    protected String tipo;  // Tipo de moneda (por ejemplo, Dólar, Euro, Peso Chileno)
    protected String simbolo;  // Símbolo de la moneda (por ejemplo, USD, EUR, CLP)
    protected Double valor;  // Monto a convertir

    // Mapa estático que contiene los factores de conversión entre diferentes monedas
    private static final Map<String, Double> CONVERSION_FACTORS = new HashMap<>();

    // Bloque estático para inicializar los factores de conversión
    static {
        CONVERSION_FACTORS.put("CLP-USD", 0.0011);
        CONVERSION_FACTORS.put("CLP-EUR", 0.00098);
        CONVERSION_FACTORS.put("CLP-AR", 0.91);
        CONVERSION_FACTORS.put("USD-CLP", 1 / 0.0011);
        CONVERSION_FACTORS.put("EUR-CLP", 1 / 0.00098);
        CONVERSION_FACTORS.put("AR-CLP", 1 / 0.91);
    }

    // Constructor con parámetros
    public ConversorMoneda(String tipo, String simbolo, Double valor) {
        this.tipo = tipo;
        this.simbolo = simbolo;
        this.valor = valor;
    }

    // Constructor sin parámetros
    public ConversorMoneda() {
    }

    @Override
    public Double Cambio(Double valor, String simboloOrigen, String simboloDestino) {
        // Clave que representa la conversión entre dos monedas
        String key = simboloOrigen + "-" + simboloDestino;
        Double conversion = 0.0;

        // Estructura switch para determinar el factor de conversión y realizar la conversión
        switch (key) {
            case "CLP-USD":
            case "CLP-EUR":
            case "CLP-AR":
            case "USD-CLP":
            case "EUR-CLP":
            case "AR-CLP":
                // Obtener el factor de conversión desde el mapa y realizar la conversión
                conversion = valor * CONVERSION_FACTORS.get(key);
                break;
            default:
                // Mensaje en caso de que no exista una conversión definida para la combinación de monedas
                System.out.println("No existe conversión para esta combinación de monedas");
                break;
        }

        return conversion;
    }

    // Métodos getters y setters para los atributos de la clase
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
