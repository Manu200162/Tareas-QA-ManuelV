package ejercicio1_nextDay;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

public class NextDay {

 public String nextDate(int dia, String mes ,int gestion){

     String respuesta ="";

     HashMap<String,String> months = new HashMap<>();
     months.put("enero","febrero");
     months.put("febrero","marzo");
     months.put("marzo","abril");
     months.put("abril","mayo");
     months.put("mayo","junio");
     months.put("junio","julio");
     months.put("julio","agosto");
     months.put("agosto","septiembre");
     months.put("septiembre","octubre");
     months.put("octubre","noviembre");
     months.put("noviembre","diciembre");
     months.put("diciembre","enero");

     boolean b = mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre");
     GregorianCalendar c =new GregorianCalendar();

     if(!months.containsKey(mes)){
        respuesta = "mes incorrecto: "+mes;
     }else if(dia<= 0 || dia> 31 ){
         respuesta = "dia incorrecto: " +dia;
     }else if(gestion<0){
        respuesta="año incorrecto: "+gestion;
     }else if (mes.equals("febrero") && (dia == 30 || dia == 31)) {
         respuesta = "dia incorrecto: "+dia;
     } else if (mes.equals("febrero") && dia == 29 && !c.isLeapYear(gestion) ) {
         respuesta = "dia incorrecto: "+dia;
     } else if (dia == 31 && b) {
         respuesta = "dia incorrecto: "+dia;
     }else{
         if(mes.equals("febrero")&& dia+1 == 29 && !c.isLeapYear(gestion) ){
             respuesta ="1 marzo "+gestion;
         }else if(mes.equals("febrero")&& dia+1 ==30 ){
             respuesta="1 marzo "+gestion;
         }else if(dia+1 ==31 && b){
             respuesta = "1 "+months.get(mes)+" "+gestion;
         }else if(dia+1 == 32 ){
            if(mes.equals("diciembre")){
                respuesta = "1 enero "+(gestion+1);
            }else{
                respuesta = "1 "+months.get(mes)+" "+gestion;
            }
         }else{
             respuesta = (dia+1)+" "+mes+" "+gestion;
         }
     }
     return respuesta;

 }

}
