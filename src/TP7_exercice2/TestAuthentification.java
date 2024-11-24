package TP7_exercice2;

public class TestAuthentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Authentification a=new Authentification();
		} catch (WrongInputLength e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		catch(pwdException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
