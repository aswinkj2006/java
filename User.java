public class User {

public String username; 
private String password; 

public User(String un, String pa) {
this.username = un; 
this.password = pa; 
}

public String getUsername() {
System.out.println("\nUsername is : ");
return username; 
} 

public void setPassword(String password) { 
this.password = password;
System.out.println("\nPassword Set Succesfully !"); 
} 

public String getPassword() { 
System.out.println("\nPassword is : ");
return password; 
}

public boolean authenticate(String iP) { 
return this.password.equals(iP);
} 

public static void main(String[] args) { 

User u1 = new User("john_doe", "secure123"); 
u1.setPassword("newPass");
System.out.println(u1.getUsername());
System.out.println(u1.getPassword());
System.out.println("Authentication: " + u1.authenticate("newPass")); // true 
System.out.println("Authentication: " + u1.authenticate("wrongPass")); // false 

} 
} 