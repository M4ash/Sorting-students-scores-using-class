import java.util.Scanner;
public class testStudent {
	//Main method...
    public static void main(String[] args) {
	System.out.print("Enter the number of students : ");
	Scanner input = new Scanner(System.in);
	
	double score;
	int st = input.nextInt();
	String n;

	Student[] obj = new Student[st];
	
	//input information
	for (int i = 0; i < st; i++) {
            obj[i]=new Student();
            System.out.println("Enter name of student no. " +(i+1));
            n = input.next();
            obj[i].setName(n);
			
            System.out.println("Enter score of student no. " +(i+1));
            score = input.nextDouble();
            obj[i].setScore(score);
	}
		
	double temp ;
	String tname;
	
	//sort in decreasing order
	for(int i = 0; i < st; i++) {
	    for(int j = 0 ; j < st; j++) {
	    	if (obj[i].score > obj[j].score) {
                    tname = obj[i].name;
                    obj[i].name = obj[j].name;
                    obj[j].name = tname;
	    			
	    			temp = obj[i].score;
	    			obj[i].score = obj[j].score;
	    			obj[j].score = temp;
	    		}
	    	}
	    }
	    //display results
	    for(int i = 0; i < st; i++) {
	    	System.out.println(obj[i].getName() +"   " +obj[i].getScore());
	    }
	}
}
