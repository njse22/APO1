package model; 


public class Planet{

	public static final int SIZE_OF_PERSONS = 10; 

	private String name; 
	private int sattelites; 
	private double au; 
	private double lengthOfYears; 

	private Person[] persons; 

	public Planet(String aname, int asattelites, double aau, double alengthOfYears){
		name = aname; 
		sattelites = asattelites; 
		au = aau; 
		lengthOfYears = alengthOfYears; 
		persons = new Person[SIZE_OF_PERSONS]; 

	}

	public String addPerson(String name, int years, String id){
		// creo el objeto persona 
		Person newPerson = new Person(name, years, id); 
	/*   ^       ^          ^----------- llamada al constructor.
 	*	 |       |___________
 	* tipo de dato          |
 	*                       |
	*                      Nombre del objeto 
 	*   */
	
		String msj = "Capacidad máxima alcanzada."; 
		boolean isEmpty = false; 
		for(int i = 0; i <SIZE_OF_PERSONS && !isEmpty; i++){
			if(persons[i] == null){
				// agrego la persona al primer espacio disponible del arreglo 
				persons[i] = newPerson; 
				isEmpty = true; 
				msj = "Nuevo visitante agregado"; 
			}
		}

		return msj; 
	}


	public String addPersonWithObject(Person person){

		String msj = "Capacidad máxima alcanzada."; 
		boolean isEmpty = false; 
		for(int i = 0; i <SIZE_OF_PERSONS && !isEmpty; i++){
			if(persons[i] == null){
				// agrego la persona al primer espacio disponible del arreglo 
				persons[i] = person; 
				isEmpty = true; 
				msj = "Nuevo visitante agregado"; 
			}
		}

		return msj; 
	}

	public int countPersons(){
		int count = 0; 
		for(int i = 0; i < SIZE_OF_PERSONS; i++){
			if(persons[i] != null){
				count++; 
			}
		}
		return count;
	}


	public String deletePerson(String personId){
		String msj = "No se encontro la persona a eliminar"; 
		int pos = searchPersonById(personId); 
		if(pos != -1){
			persons[pos] = null; 
			msj = "la persona ha sido eliminada"; 
		}
		return msj; 
	} 

	public int searchPersonById(String personId){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < SIZE_OF_PERSONS && !isFound; i++){
			if(persons[i].getId().equals(personId)){
				pos = i; 
				isFound = true; 
			}
		}

		return pos; 
	}
	
} 
