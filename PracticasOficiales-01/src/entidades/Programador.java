package entidades;

 public class Programador extends Empleado{

	public Programador(String nombre, int salario) {
		super(nombre, salario);
		// TODO Auto-generated constructor stub
	}
	
	public void trabajoduro(int salario) {
		salario = salario * 2;
		System.out.println("programador/a recibe exp y un poco mas de dinero "+ salario +" esfuerzate un poco mas para la proxima");
	}
	
	public void trabajosombras(int salario) {
		salario = salario - salario;
		System.out.println("programador/a trabaja arduamente en horas extras, sin paga "+ salario + " y consigue exp Lo que importa es que aprendas");
	}

}
