
/**
 * Write a description of class DisplayHoraFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraFecha
{
    // instance variables - replace the example below with your own
    private int hora;
    private int minuto;
    private int dia;
    private String mes;
    private int anio;
    private String mostrarTempo;

    /**
     * Constructor for objects of class DisplayHoraFecha
     */
    public DisplayHoraFecha()
    {
        hora = 0;
        minuto = 0;
        dia = 1;
        mes = "enero";
        anio = 2001;
        if (minuto < 10){ 
            String mostrarTiempo = "0" + hora + "0" + minuto + mes + anio;}
        if (dia < 10) {
            String mostrarTiempo = "0" + hora + "0" + minuto + "0" + dia + mes + anio;
        }    
        else {String mostrarTiempo = "0" + hora + minuto + dia + mes + anio;}

    }

    public void avanzarMomento(){
        if (minuto < 60){
            minuto = minuto + 1;
        }
        if (hora < 24){
        hora = 1;
        dia = dia + 1;
        }
        else {minuto = 0;
            hora = hora + 1;}
    }

    public void setMomento(int hora, int dia, String mes, int anio){
       

    }
   public String getMomento(){
       
       
      
       if(dia < 10){
		 String dia = "0" + dia;
		}
		else{
			dia = dia ;
		}
		String mes;
		mes = mes;
		String anio;
		anio = anio;
		
		if (hora < 24){
        hora = 1;
        dia = dia + 1;
    }
		
		if (minuto < 60){
           minuto = minuto + 1;
        }
		
		mostrarTempo = hora + ":" + minuto + " " + dia + "/" + mes + "/" + anio;
	    return mostrarTempo;
       
    }
}
