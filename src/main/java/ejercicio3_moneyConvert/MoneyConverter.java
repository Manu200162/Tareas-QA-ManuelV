package ejercicio3_moneyConvert;

public class MoneyConverter {
    Converter converter;

    public MoneyConverter(){
        converter= new Converter();
    }

    //Constructor mockeado
    public MoneyConverter(Converter converter){
        this.converter=converter;
    }

    public String moneyConverter(int n, String MInit, String MFinal){
        String respuesta="";
        if(n<= 0){
            respuesta="Cantidad incorrecta";
        }else{
            double tcCambio=converter.converter(MInit,MFinal);
            double cant= n*tcCambio;
            respuesta="["+cant+"]------> "+MFinal;
        }

        return respuesta;

    }
}
