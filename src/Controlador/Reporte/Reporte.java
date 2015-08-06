package Controlador.Reporte;

import org.orm.PersistentException;

import com.google.gson.Gson;
/**
 * 
 * @author Alfredo Rojas
 *
 */
public class Reporte {

	public Reporte(){
		super();
	}
	//private static final int ROW_COUNT = 100;

	/**
	 * este metodo calcula los ingresos de mensualidad por mes
	 * @return int[] con los valores de los 10 meses
	 */
	public static int[] balanceMensualidad(){
		int[] mes= new int[10];
		try {
			//se buscan todas la mensualidades y se almacenan
			orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(null, null);
			
			//int length = Math.min(ormMensualidads.length, ROW_COUNT);
			int length = ormMensualidads.length;
			
			//se recorren todas la mensalidades y se guardan los montos dependiendo el mes
			for (int i = 0; i < length; i++) {
				// se asigna a cadda mes su total correspondiente
				if(ormMensualidads[i].getMes()==1 ){
					mes[0]= mes[0]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==2){
					mes[1]= mes[1]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==3){
					mes[2]= mes[2]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==4){
					mes[3]= mes[3]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==5){
					mes[4]= mes[4]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==6){
					mes[5]= mes[5]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==7){
					mes[6]= mes[6]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==8){
					mes[7]= mes[7]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==9){
					mes[8]= mes[8]+ormMensualidads[i].getMonto();
				}if(ormMensualidads[i].getMes()==10){
					mes[9]= mes[9]+ormMensualidads[i].getMonto();
				}	
			}		
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mes;		
	}
	
	/**
	 * este metodo calcula el monto de todas las matriculas pagadas
	 * @return int con el monto de ingreso por matricula
	 */ 
	public static int balanceMatricula(){
		int totalMatricula=0;
		try {
			// se buscan todas la matriculas 
			orm.Matricula[] ormMatriculas = orm.MatriculaDAO.listMatriculaByQuery(null, null);
			
			//int length = Math.min(ormMatriculas.length, ROW_COUNT);
			int length = ormMatriculas.length;
			
			//se recorren todas las matriculas y si la matricula tiene el estado pagado = 1
			//se le suma a la variable totalMatricula
			for (int i = 0; i < length; i++) { 
				if(ormMatriculas[i].getEstadoMatricula()==1){
					totalMatricula= totalMatricula+ormMatriculas[i].getMonto();
				}
			}
				
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalMatricula;
		
		
	}
	
	/**
	 * este metodo guarda los todos los sueldos que se le pagaron
	 *  a los profesores por mes.
	 * @return int[] montos de los sueldos por meses
	 */
	public static int[] balanceSueldoProfes() {
		int[] mes = new int[10];
		try {
			// se buscan todos los sueldos
			orm.Sueldo[] ormSueldos = orm.SueldoDAO.listSueldoByQuery(null, null);
			
			//int length = Math.min(ormSueldos.length, ROW_COUNT);
			int length =ormSueldos.length;
			
			//se recorren los sueldos, se suman los motos por meses
			// y se guardan en el arreglo
			for (int i = 0; i < length; i++) {
				
				// se identfica el mes para sumar los montos
				if (ormSueldos[i].getMes() == 1) {
					mes[0] = mes[0] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 2) {
					mes[1] = mes[1] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 3) {
					mes[2] = mes[2] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 4) {
					mes[3] = mes[3] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 5) {
					mes[4] = mes[4] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 6) {
					mes[5] = mes[5] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 7) {
					mes[6] = mes[6] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 8) {
					mes[7] = mes[7] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 9) {
					mes[8] = mes[8] + ormSueldos[i].getMonto();
				}
				if (ormSueldos[i].getMes() == 10) {
					mes[9] = mes[9] + ormSueldos[i].getMonto();
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mes;

	}
	
	/**
	 * este metodo calcula el balance de los ingresos de matricula, mensualidad
	 * y le resta los montos de los sueldos pagados a los profesores
	 * @return
	 */
	public static String obtenerBalanceIngGasto() {
		String matrizBalance[][];
		int totalIngresoMatricula=0;
		
		Gson gson = new Gson();
		String balance=null;
		
		int[] balanceSueldo=balanceSueldoProfes();//se obtienen los sueldos pagados a los profesores
		int[] balanceMensualidad=balanceMensualidad();//se obtienen los montos de mensualidad
		totalIngresoMatricula=balanceMatricula();//int, se obtienen los montos de matricla
		
		//se crea la matriz de 10 meses y 3 valores por mes
		matrizBalance= new String[10][3];
		for (int i = 0; i < matrizBalance.length; i++) {  //número de filas
		     for (int j = 0; j < matrizBalance[i].length; j++) { //número de columnas
		        
		    	//guarda en ingreso, gasto y total por meses
		    	int totalIngreso= balanceMensualidad[i]+totalIngresoMatricula;//al primer mes se le suma el monto de matricula
		    	matrizBalance[i][0]=""+(totalIngreso);//ingreso por mes (mes + matricula)
		        matrizBalance[i][1]=""+(balanceSueldo[i]);//gasto por mes (sueldo por mes)
		        matrizBalance[i][2]=""+(totalIngreso-balanceSueldo[i]);//ingreso-gasto por mes
		            
		     }
		     totalIngresoMatricula=0;
		     //System.out.println(matrizBalance[i][0]+" y "+matrizBalance[i][1] +" y "+matrizBalance[i][2]);
		}
		balance = gson.toJson(matrizBalance);
		return balance;
		
	}

}