package abs.controller;

public class UserAuth {

	
	/*  */
	
	public boolean authUser(String email, String Password) {
		
		/* Import customer list */
		this.customers = getCustomers();

		
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
					/* if there doesnt exist an '@', but a '.com' has been found, exit fail */
					if(email.toLowerCase().contains(".com") && counterAt < 1){
						return false;
						
					/* check again if there is an '.com', +1 to counterPeriod */
					}else if(email.toLowerCase().contains(".com")){
						counterPeriod += 1;

					}
					if(counterPeriod > 1){
						return false;
					}
				}
				

				
			}
			
			
		}
		
		/* no validation for passwords, anything at this point that is not an empty string is accepted */
		
		
		/* ***NEEDS TO BE LOOKED AT*** this will check with current email accounts to ensure there are no already existing emails accounts by the same name */
		if(email.equals(customers.getEmail())){
			return false;
		}
		

	}

	public boolean registerUser(String name, String email, String password, String address, String phone) {
		
		
		int apartmentNumber, streetNumber, postcode;
		string streetName, suburbName, state, tempString;
		
		if(authUser(email, password) == false){
			return false;
		}
		
		if(name == null){
			return false;
		}
		
		if(address != null){
			
			String delim1 = "/";
			String delim2 = " ";
			
			if(address.contains("/") && isDigit(address.charAt(0));){
				StringTokenizer st1  = new StringTokenizer(address, delim1);
				
				apartmentNumber = address.nextToken();
				streetNumber = address.nextToken();

			}else{
				return false;
			}
			
			/* Redo this rubbish */
			StringTokenizer st2  = new StringTokenizer(address, delim2);
			
			address.nextToken();
			streetName = address.nextToken();
			suburbName = address.nextToken();
			
			if(address.hasMoreTokens()){
			tempString = address.nextToken();
			if(tempString.matches(".*[0-9].*")){
				postcode = tempString;
			}else{
				suburbName = tempString;
			}
			}else{
				return false;
			}
			
			if(address.hasMoreTokens()){
			tempString = address.nextToken();
			if(tempString.matches(".*[0-9].*")){
				postcode = tempString;
			}else{
				state = tempString;
			}
			}else{
				return false;
			}
				
			if(address.hasMoreTokens()){
			tempString = address.nextToken();
			if(tempString.matches(".*[0-9].*")){
				postcode = tempString;
			}else{
				return false;
			}
			}else{
				return false;
			}
		}
		
		if(phoneNumber.matches(".*[a-z].*")){
			return false;
		}
		
		return false;

	}

}
