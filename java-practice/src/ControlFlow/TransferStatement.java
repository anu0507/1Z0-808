package ControlFlow;

public class TransferStatement {

	public static void main(String[] args) {

		// for (int i = 0; i < 10; i++) {
		 //if (i == 4)
		 
		// System.out.println("anu");
		label:
		break label;

		//}

		
		/**for (int i = 0; i < 5; i++) {

		 if (i < 2) {
		 continue label;
		 System.out.println("anu");
		}**/
		int y = 10;
		amit: {
			anu: {
				System.out.println("amit");
				if (y == 10)
					break "amit";
				System.out.println("hello");

			}
			System.out.println("kalawati");

		}
		System.out.println("bye");
		

	}
	}


