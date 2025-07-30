import java.util.*;

public class Incumtax {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int incom=sc.nextInt();
    int tax=0;
if (incom<50000){
    System.out.println(tax);
}else if(incom>=50000 && incom<100000){
    tax=(int)(incom*0.2);
}
else{
    tax=(int)(incom*0.3);
}
System.out.println("Your tax is:" + tax);
} 
}
