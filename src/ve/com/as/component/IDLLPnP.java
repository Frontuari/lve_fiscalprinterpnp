package ve.com.as.component;

import com.sun.jna.Library;
import com.sun.jna.win32.StdCallLibrary;
/**
 * 
 * Interface for to call funtions of DLLPnP
 * IDLLPnP.java
 * @author Ing. Victor Su�rez - victor.suarez.is@gmail.com - 01/2017 - Venezuela
 * 
 */
public interface IDLLPnP extends StdCallLibrary {

	/**	Abrir Puerto Impresora
	 * @param Port - Puerto Impresora Fiscal
	 * @return 
	 * 		- OK: Transmisi�n/recepci�n fue correcta
	 * 		- ER: Existe un error
	 * 		- NP: Puerto No Abierto
	 * 		- TO: Se excedi� el tiempo de respuesta esperado del equipo 
	 * **/
	public String PFabrepuerto(String Port);
	
	/**	Inicia el Documento Fiscal	
	 * @param Partner - Raz�n Social
	 * @param RIF
	 * @return 
	 * 		- OK: Transmisi�n/recepci�n fue correcta
	 * 		- ER: Existe un error
	 * 		- NP: Puerto No Abierto
	 * 		- TO: Se excedi� el tiempo de respuesta esperado del equipo
	 * **/
	public String PFabrefiscal(String Partner, String RIF);
	
	/**
	 * Env�a un rengl�n (Item o producto) de la factura.
	 * @param Description
	 * @param Qty
	 * @param Price
	 * @param IVA
	 * @return
	 * 		- OK: Transmisi�n/recepci�n fue correcta
	 * 		- ER: Existe un error
	 * 		- NP: Puerto No Abierto
	 * 		- TO: Se excedi� el tiempo de respuesta esperado del equipo 		
	 */
	public String PFrenglon(String Description, String 	Qty, String Price, String IVA);
	
	/**
	 * Genera el final de una facture, imprime el total si este no fue generado por un comando parcial previo y corta el papel.
	 * @return
	 * 		- OK: Transmisi�n/recepci�n fue correcta
	 * 		- ER: Existe un error
	 * 		- NP: Puerto No Abierto
	 * 		- TO: Se excedi� el tiempo de respuesta esperado del equipo 
	 */
	public String PFtotal();
	
	public String PFCortar();
	
	public String PFDevolucion(String Partner, String RIF, String LVE_FiscalDocNo, String LVE_FiscalSerial, String Date, String Hour);
	
	public String PFestatus(String Type);
	
	public String PFrepx();
	
	public String PFrepz();
	
	public String PFreset();
	
	public String PFserial();
	
	public String PFTfiscal(String Text);
	
	public String PFultimo();
	
	public String PFcierrapuerto();
}
