package ejercicio2_primos_mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class NumbersGeneratorTest {

    PrimoUtil primoUtilMock= Mockito.mock(PrimoUtil.class);

    @Test
    public void verifyGeneratedNumbers1() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(11)).thenReturn(true);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(11);
        String expected="2 4 6 8 10";
        Assertions.assertEquals(expected,actual,"Error el mensaje no es esperado");
        Mockito.verify(primoUtilMock).esPrimo(11);

    }
    @Test
    public void verifyGeneratedNumbers2() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(2)).thenReturn(true);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(2);
        String expected ="2";
        Assertions.assertEquals(expected,actual,"Error de mensaje de salida");
        Mockito.verify(primoUtilMock).esPrimo(2);

    }
    @Test
    public void verifyGeneratedNumbers3() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(15)).thenReturn(false);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(15);
        String expected ="1 3 5 7 9 11 13 15";
        Assertions.assertEquals(expected,actual,"Error de mensaje de salida");
        Mockito.verify(primoUtilMock).esPrimo(15);

    }
    @Test
    public void verifyGeneratedNumbers4() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(8)).thenReturn(false);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(8);
        String expected ="1 3 5 7";
        Assertions.assertEquals(expected,actual,"Error de mensaje de salida");
        Mockito.verify(primoUtilMock).esPrimo(8);

    }
    @Test
    public void verifyGeneratedNumbers5() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(23)).thenReturn(true);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(23);
        String expected ="2 4 6 8 10 12 14 16 18 20 22";
        Assertions.assertEquals(expected,actual,"Error de mensaje de salida");
        Mockito.verify(primoUtilMock).esPrimo(23);

    }

    @Test
    public void verifyGeneratedNumbers6() throws Exception {
        Mockito.when(primoUtilMock.esPrimo(21)).thenReturn(false);
        Generador ge =new Generador(primoUtilMock);
        String actual= ge.getNumberValues(21);
        String expected ="1 3 5 7 9 11 13 15 17 19 21";
        Assertions.assertEquals(expected,actual,"Error de mensaje de salida");
        Mockito.verify(primoUtilMock).esPrimo(21);

    }

    @ParameterizedTest
    @CsvSource({
            "0",
            "-10"
    })
    public void verifyBadEntrance(int number){
        Generador g= new Generador();
        Assertions.assertThrows(Exception.class,()->{g.getNumberValues(number);});
    }






}
