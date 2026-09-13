import java.util.*;
class palindrom{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");

    int num = sc.nextInt();
    int reverse = 0;
    int original = num;

    while(num>0)
    {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }
    if(original == reverse)
    {
        System.out.println("palindrom number ");
    }else {
        System.out.println("Not palindrom number ");
    }
}
}