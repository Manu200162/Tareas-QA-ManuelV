package ejercicio3_moneyConverter;

import ejercicio3_moneyConvert.Converter;
import ejercicio3_moneyConvert.MoneyConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MoneyConverterTest {

    Converter convertMock = Mockito.mock(Converter.class);

    @Test
    public void verifyConversion(){
        Mockito.when(convertMock.converter("Dolares","Bolivianos")).thenReturn(6.97);
        MoneyConverter money= new MoneyConverter(convertMock);
        String actual= money.moneyConverter(100,"Dolares","Bolivianos");
        String expected ="[697.0]------> Bolivianos";
        Assertions.assertEquals(expected,actual,"ERROR salida erronea");
        Mockito.verify(convertMock).converter("Dolares","Bolivianos");

    }
    @Test
    public void verifyBadEntrance(){
        MoneyConverter moneyConverter =new MoneyConverter();
        String actual =moneyConverter.moneyConverter(-12,"Bolivianos","Soles");
        String expected="Cantidad incorrecta";
        Assertions.assertEquals(expected,actual,"ERROR la slaida es incorrecta");
    }
}
