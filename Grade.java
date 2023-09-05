import java.util.Scanner;
public class Grade {


   public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        int i;
        float total=0, average;
        Scanner sc = new Scanner(System.in); 

		// Here we are calculating grade of a student for 6 subjects
        
        for(i=0; i<6; i++) { 
           System.out.println("Enter Marks of Subject"+(i+1)+":");
           marks[i] = sc.nextInt();
           total = total + marks[i];
        }
        sc.close();

        //Calculating average here
        
        average = total/6;
        
        System.out.print("The student Grade is: ");
        if(average>=80)
        {
            System.out.print("A");
        }
        else if(average>=60 && average<80)
        {
           System.out.print("B");
        } 
        else if(average>=40 && average<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
    