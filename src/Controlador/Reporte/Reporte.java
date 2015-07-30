package Controlador.Reporte;

import org.orm.PersistentException;

public class Reporte {

	private static final int ROW_COUNT = 100;
	
	public static int[] balanceMen(){
		int[] mes= new int[10];
		try {
			 //se crea un arreglo orm.mensualidad
			orm.Mensualidad[] ormMensualidads = orm.MensualidadDAO.listMensualidadByQuery(null, null);
			int length = Math.min(ormMensualidads.length, ROW_COUNT);
			//se recorre el arreglo
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
	
	public static int balanceMat(){
		int totalM=0;
		try {
			// crea un arreglo de orm.Matriculas
			orm.Matricula[] ormMatriculas = orm.MatriculaDAO.listMatriculaByQuery(null, null);
			int length = Math.min(ormMatriculas.length, ROW_COUNT);
			for (int i = 0; i < length; i++) {
				// si las matriculas se encuentran pagadas se sumara al total 
				if(ormMatriculas[i].getEstadoMatricula()==1){
					totalM= totalM+ormMatriculas[i].getMonto();
				}
			}
				
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalM;
		
		
	}
	
	public static int[] balanceSueldo() {
		int[] mes = new int[10];
		try {
			// se crea un arreglo orm Sueldo
			orm.Sueldo[] ormSueldos = orm.SueldoDAO.listSueldoByQuery(null, null);
			int length = Math.min(ormSueldos.length, ROW_COUNT);
			System.out.println("hasdasd");
			for (int i = 0; i < length; i++) {
				
				// recorre y guarda los datos en un arreglo de total por mes
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
	
	public static String[][] obtenerBalanceIngGasto() {
		int totalM=0;
		int[] balanceS=balanceSueldo();
		int[] balanceM=balanceMen();
		totalM=balanceMat();
		//creacion de matriz
		String[][] matrizBalance= new String[10][3];
		for (int i = 0; i < matrizBalance.length; i++) {  //número de filas
		     for (int j = 0; j < matrizBalance[i].length; j++) { //número de columnas de cada fila
		         //se guardan los datos correspondiente a los ingrso y gasto en su posicion 
		    	int suma= balanceM[i]+totalM;
		    	 matrizBalance[i][0]=""+(suma);
		          matrizBalance[i][1]=""+(balanceS[i]+0);
		          matrizBalance[i][2]=""+(suma-balanceS[i]);
		            
		     }
		     totalM=totalM-totalM;
		     System.out.println(matrizBalance[i][0]+" y "+matrizBalance[i][1] +" y "+matrizBalance[i][2]);
		}
		return matrizBalance;
		
	}
	
	public static orm.Sueldo_profesor[] balanceSueldoProf(){
		orm.Sueldo_profesor[] ormSueldo_profesors=null;
		try {
			ormSueldo_profesors = orm.Sueldo_profesorDAO.listSueldo_profesorByQuery(null, null);
			int length = Math.min(ormSueldo_profesors.length, ROW_COUNT);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ormSueldo_profesors;
		
	}

}