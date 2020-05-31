import java.util.Scanner;
public class Employee {
	

	private String name;
	private String username;
	private String email;
	private String password;
	int count = 0;
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public Employee () {
		 name = setName();
		 username = setUserName(name);
		 email = setEmail(username);
		 password = setPassword(username);
	 }

	private int countChars(String B, char A) {
		 for(int i = 0; i<B.length(); i++) {
			 if(B.charAt(i)==A) {
		    count++;
			 }
		 }
		return count;
	 }
	 public String setName() {
		 
		  Scanner s = new Scanner(System.in);
		  int A = 0;
		  while (A!=1) {
			  name = s.nextLine();
			  A = countChars (name, ' ' );
		  }
		  return name;
	 }
	 public String setUserName(String name) {
		 return this.name.replace(' ', '.').toLowerCase();
	 }
	 public String setEmail(String username) {
		 return email = username.substring(0,1) + username.substring(username.indexOf('.')+1,username.length()) + "@oracleacademy.Test";
	 }
	 public String setPassword(String username) {
	int length = 8;
	String S = username;
	if(S.length()<length) {
		int lengthS = S.length();
		for(int i = 0; i < length - lengthS; i++) {
			S+='*';
		}
	}
	if(S.length()>length) {
		S=S.substring(0,length);
	}
	return S.replaceAll("[aeiouy]", "*");

	 }
	public String toString() {
		return "Employee Details \nName\t\t:" + name + "\nUsername\t:" + username + "\nEmail\t\t:" + email + "\nIntitialPassword:" + password;
	}
	}


