import java.util.Scanner;

class Characteralphabet{
public static void main(String[] args) {
    
 
Scanner scanner = new Scanner(System.in);

System.out.println("enter any character");

char ch = scanner.next().charAt(0);

if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <='z'))
{
System.out.println(ch + " is alphabet");
}
else
{System.out.println(ch + " is not alphabet");
}


}
}


