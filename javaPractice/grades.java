import java.util.Scanner;
public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[4];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<4; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/4;
        System.out.print("The subject Grade is: ");
        if(avg>90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("Fail");
        }
	}

}
