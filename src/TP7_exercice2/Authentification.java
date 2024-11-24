package TP7_exercice2;
import java.util.*;
public class Authentification {

	String LoginCorrect="scott";
	String PwdCorrect="tiger";
	
	
	public String getUserLogin() throws WrongInputLength, LoginException {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner votre login");
		String login=sc.nextLine();
		if(login.length()>9) {
			throw new WrongInputLength("taille différent");
		}
		if(! login.equals(LoginCorrect)) {
			throw new LoginException("login incorrecte");
		}
		return login;
	}
	
	public String getUserPwd() throws WrongInputLength, pwdException {
		Scanner sc=new Scanner(System.in);
		System.out.println("donner votre pwd");
		String pwd=sc.nextLine();
		if(pwd.length()>9) {
			throw new WrongInputLength("taille différent");
		}
		if(! pwd.equals(PwdCorrect)) {
			throw new pwdException("pwd incorrecte");
		}
		return pwd;
		
	}
	
	public Authentification() throws WrongInputLength, LoginException, pwdException {

		this.LoginCorrect=getUserLogin();
		this.PwdCorrect=getUserPwd();
			
	}
	
	
}
