package oopclass1;

public class Humano {
	//Attributes
	private int edad;
	private int altura;
	private int peso;
	private String nombre;
	//Constructor with parameters
	public Humano(int edad, int altura, int peso, String nombre) {
		super();
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.nombre = nombre;
	}
	//Empty default constructor
	public Humano() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Methods with parameter and return value
	public boolean saltar(int huevo) {
		System.out.println("Humano salto con "+huevo+" huevos");
		return true;
	}
	
	public void comer(String comida) {
		System.out.println("Humano comio "+comida);
	}
	//getters and setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
