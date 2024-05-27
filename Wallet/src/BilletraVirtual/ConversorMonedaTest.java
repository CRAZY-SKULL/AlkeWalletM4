package BilletraVirtual;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConversorMonedaTest {

    @Test
    public void testCambio() {
        // Crear una instancia del conversor de moneda
        ConversorMoneda conversor = new ConversorMoneda();

        // Definir los parámetros de prueba
        Double cantidad = 100.0;
        String simboloOrigen = "CLP";
        String simboloDestino = "USD";

        // Llamar al método que se va a probar
        Double resultado = conversor.Cambio(cantidad, simboloOrigen, simboloDestino);

        // Definir el resultado esperado
        // Puedes ajustar este valor según el factor de conversión actual
        Double resultadoEsperado = cantidad * 0.0011;

        // Verificar si el resultado obtenido es igual al esperado
        assertEquals(resultadoEsperado, resultado, 0.001); // El tercer parámetro es la tolerancia para la comparación de valores dobles
    }
}
