import java.util.Scanner;

public class program6 {
    public static void main(String[] args){
System.out.println("total marksheet");

System.out.println("enter the marks of hindi");
Scanner sc = new Scanner(System.in);
int hindi = sc.nextInt();

System.out.println("enter the marks of math");
int math = sc.nextInt();

System.out.println("enter the marks of english");
int english = sc.nextInt();

int total = hindi + english + math/300*100;

if(total>33) {
    System.out.println("you are passed");
}
else{
    System.out.println("you are fail");
}
    }
}
