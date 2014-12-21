package forLab05;
// A small text only application to practice tracing
// and to explore the debugger
// Lab 05  

public class TraceSelection{

	public static void main(String args[ ]) {
		int x = 11; //L9
		int y = 9; //L10
		if ( x < 10 ) { //L11
			if ( y > 10 ) { //L12
				System.out.println("*****"); //L13
			} else {
				System.out.println("#####"); //L15
			}//else
		}//outer if
		System.out.println("$$$$$"); //L18
	}//main method
		
}//class TraceSelection 
