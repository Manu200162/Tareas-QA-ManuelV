package ejercicio1_nextDay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NextDayTest {

    @ParameterizedTest
    @CsvSource({
            "1,may,2011,mes incorrecto: may",
            "1,mayo,0,2 mayo 0",
            "-1,enero,2022,dia incorrecto: -1",
            "0,enero,2022,dia incorrecto: 0",
            "1,enero,2022,2 enero 2022",
            "15,enero,2022,16 enero 2022",
            "31,enero,2022,1 febrero 2022",
            "32,enero,2022,dia incorrecto: 32",

            "-1,febrero,2022,dia incorrecto: -1",
            "0,febrero,2022,dia incorrecto: 0",
            "1,febrero,2022,2 febrero 2022",
            "15,febrero,2022,16 febrero 2022",
            "28,febrero,2020,29 febrero 2020",

            "-1,marzo,2022,dia incorrecto: -1",
            "0,marzo,2022,dia incorrecto: 0",
            "1,marzo,2022,2 marzo 2022",
            "15,marzo,2022,16 marzo 2022",
            "31,marzo,2022,1 abril 2022",
            "32,marzo,2022,dia incorrecto: 32",

            "-1,abril,2022,dia incorrecto: -1",
            "0,abril,2022,dia incorrecto: 0",
            "1,abril,2022,2 abril 2022",
            "15,abril,2022,16 abril 2022",
            "30,abril,2022,1 mayo 2022",
            "31,abril,2022,dia incorrecto: 31",

            "-1,mayo,2022,dia incorrecto: -1",
            "0,mayo,2022,dia incorrecto: 0",
            "1,mayo,2022,2 mayo 2022",
            "15,mayo,2022,16 mayo 2022",
            "31,mayo,2022,1 junio 2022",
            "32,mayo,2022,dia incorrecto: 32",

            "-1,junio,2022,dia incorrecto: -1",
            "0,junio,2022,dia incorrecto: 0",
            "1,junio,2022,2 junio 2022",
            "15,junio,2022,16 junio 2022",
            "30,junio,2022,1 julio 2022",
            "31,junio,2022,dia incorrecto: 31",

            "-1,julio,2022,dia incorrecto: -1",
            "0,julio,2022,dia incorrecto: 0",
            "1,julio,2022,2 julio 2022",
            "15,julio,2022,16 julio 2022",
            "31,julio,2022,1 agosto 2022",
            "32,julio,2022,dia incorrecto: 32",

            "-1,agosto,2022,dia incorrecto: -1",
            "0,agosto,2022,dia incorrecto: 0",
            "1,agosto,2022,2 agosto 2022",
            "15,agosto,2022,16 agosto 2022",
            "31,agosto,2022,1 septiembre 2022",
            "32,agosto,2022,dia incorrecto: 32",

            "-1,septiembre,2022,dia incorrecto: -1",
            "0,septiembre,2022,dia incorrecto: 0",
            "1,septiembre,2022,2 septiembre 2022",
            "15,septiembre,2022,16 septiembre 2022",
            "30,septiembre,2022,1 octubre 2022",
            "31,septiembre,2022,dia incorrecto: 31",

            "-1,octubre,2022,dia incorrecto: -1",
            "0,octubre,2022,dia incorrecto: 0",
            "1,octubre,2022,2 octubre 2022",
            "15,octubre,2022,16 octubre 2022",
            "31,octubre,2022,1 noviembre 2022",
            "32,octubre,2022,dia incorrecto: 32",

            "-1,noviembre,2022,dia incorrecto: -1",
            "0,noviembre,2022,dia incorrecto: 0",
            "1,noviembre,2022,2 noviembre 2022",
            "15,noviembre,2022,16 noviembre 2022",
            "30,noviembre,2022,1 diciembre 2022",
            "31,noviembre,2022,dia incorrecto: 31",

            "-1,diciembre,2022,dia incorrecto: -1",
            "0,diciembre,2022,dia incorrecto: 0",
            "1,diciembre,2022,2 diciembre 2022",
            "15,diciembre,2022,16 diciembre 2022",
            "31,diciembre,2022,1 enero 2023",
            "32,diciembre,2022,dia incorrecto: 32"
    })
    public void verifyTheNextDay(int dia, String mes, int gestion, String expectedResult){
        NextDay nd =new NextDay();
        String actualResult= nd.nextDate(dia,mes,gestion);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el mensaje es incorrecto");
    }
}
