package ibrahima_cheikh_project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = args[0].charAt(0);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		
		switch(ch){
			case 'a':
				System.out.println("Addition de deux nombres entier donné: " + new Operation().add(a, b));
			break;			
			case 'm':
				System.out.println("Multiplication de deux nombres donnés: " + new Operation().mul(a,b));
			break;
			default:
				System.out.println("L'arguments passé n'est pas pas valide!!");
			break;

		}

	}
}
