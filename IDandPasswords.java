import java.util.*;
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Madhura","123456");
		logininfo.put("Anish","anish");
		logininfo.put("Purva","purva");
		logininfo.put("Vaibhav","vaibhav");
		logininfo.put("Fathima","fathima");
		logininfo.put("me","1");
		logininfo.put("Annyeong","123");
		logininfo.put("Pooja","mam");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}