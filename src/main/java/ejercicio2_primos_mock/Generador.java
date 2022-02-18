package ejercicio2_primos_mock;

public class Generador {

    PrimoUtil primoUtil;
    public Generador(){
        primoUtil=new PrimoUtil();
    }

    //Constructor para el mock
    public Generador(PrimoUtil objectoMockeado){
        primoUtil=objectoMockeado;
    }

    public String getNumberValues(int number) throws Exception {
        String ans ="";
        if(number<=0){
            throw new Exception("numero de entrada incorrecto");
        }
        if(!primoUtil.esPrimo(number)){
            for(int i= 1 ; i<=number ; i=i+2){
                ans+= i+" ";
            }

        }else{
            for(int i =2 ; i<=number; i+=2){
                ans+= i+" ";
            }

        }
        return ans.trim();
    }
}
