import javax.swing.*;

public class PalindromeGUI{
public static void main(String args[]){

try{

JOptionPane.showMessageDialog(null,"Palindrome Operation");
String input = JOptionPane.showInputDialog("Enter Number: ");
int x = Integer.parseInt(input);

if(x<0){
JOptionPane.showMessageDialog(null,"Negative not allowed try again !");
return;
}

int rev = 0;
int og = x;

while(x>0){
int digit = x % 10;
rev = rev*10+digit;
x/=10;
}

JOptionPane.showMessageDialog(null,"Palindrome : "+(og==rev));

}catch(NumberFormatException e){

JOptionPane.showMessageDialog(null,"Enter a valid number");
}
}
}