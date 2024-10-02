import java.util.Scanner;
public class VotingEligibilityChecker
{
    public static void main(String [] args)
    {
        System.out.print("Enter the Candidate's age: ");

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18)
        {
        System.out.println("Candidate can vote");
        }

        else if (age<0) {
            System.out.println("Enter valid age");
        }

        else
        {
        System.out.println("Candidate cannot vote");
        }
    }
}