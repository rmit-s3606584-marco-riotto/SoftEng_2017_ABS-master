package abs.controller;

public class UserAuth {

	
	/*  */
	
	public boolean authUser(String email, String Password) {
		
		/* Validate Email*/
		int counter, emailLength;
		
		/* checks if either the email or password was left empty, exit if empty */
		if (email.length() == 0 || Password.length() == 0 || email.matches("~!#$%^&*()_+{}|[]\:;'<>?,/ ")){
			return false;

		}else{
			
			emailLength = email.length();
			counter = 0;
			counterAt = 0;
			counterPeriod = 0;
			
			/* loop through individual characters in the string 'email' and compares to '@' and '.', there should only be one of each example in the string of each, and they must be in order '@' followed by '.'*/
			while(counter; counter <= emailLength-1; counter++){
				
				/* if there are more than one '@' or '.', exit fail */
				if(counterAt > 1 || counterPeriod > 1){
					return false;
				}else{
					
					/* if there is a @ found, +1 to counterAt */
					if(email.charAt(counter).matches("@")){
						counterAt += 1;
					}
					/* if there doesnt exist an '@', but a '.' has been found, exit fail */
					if(email.charAt(counter).matches(".") && counterAt < 1){
						return false;
						
					/* check again if there is an '@', +1 to counterPeriod */
					}else if(email.charAt(counter).matches(".")){
						counterPeriod += 1;

					}
				}
				

				
			}
			
			
		}
		
		/* no validation as of yet has been selected for passwords, anything at this point that is not an empty string is accepted */
		
		/* assumption that only email and password needs to be validated, name, adress and phone have not been specified */
		
		
		/* ***NEEDS TO BE LOOKED AT*** this will check with current email accounts to ensure there are no already existing emails accounts by the same name */
		if(email.equals(AbstractUser.getEmail())){
			return false;
		}

	}

	public boolean registerUser(String name, String email, String password, String address, String phone) {
		
		
		
		return false;

	}

}
