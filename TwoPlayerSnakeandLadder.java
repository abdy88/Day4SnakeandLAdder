package bl.com.day4practiceproblems;

public class TwoPlayerSnakeandLadder {

	
public static void main(String[] args) {
		
		System.out.println("---Welcome to Snake and Ladder Simulator---");

//		 
		snakeladdersimulator();
		
		
}
		
		     static void snakeladdersimulator() {
		    	 
		    	 
		    	 int position1=0;
		    	 int position2=0;
//				 short options= (short)(Math.random() * 3 + 1);
//				 System.out.println("option is =" + options);
				 final short noplay=1;
				 final short ladder=2;
				 final short snake=3;
//				 int countOfThrow=0;
				 
		    	 
		    	 
		 while (position1<=100 || position2<=100)
		 {
			 int dieThrow1= (int)(Math.random() * 6 + 1);
			 int dieThrow2= (int)(Math.random() * 6 + 1);
			 
			 
			 System.out.println("dieThrow1 is =" + dieThrow1);
			 System.out.println("dieThrow2 is =" + dieThrow2);
			 
//			 countOfThrow ++;
//			 System.out.println("total count of throw = " + countOfThrow );
			 
			
//			 Player one turn
 
			 short options1= (short)(Math.random() * 3 + 1);
//			 short options2= (short)(Math.random() * 3 + 1);
			 
			 System.out.println("option1 is =" + options1);
			 
			 
			 switch (options1)
			 {
			 
			 case (noplay):
				 {
			 		 }
			 break;
		 
			 case (ladder):
				 {
			 		position1 =(position1 + dieThrow1);
//			 		position2 =(position2 + dieThrow2);
			 		
			 		System.out.println("Since ladder, its player ones turn");
//			 		System.out.println("current position of player 1 before replay : " + position1);
			 		position1=options(position1);
//			 		System.out.println("current position of player1 aftere replay =" + position1);
			 		
			 		
				 }
			 break;
			 
			 case (snake):
				 {
			 		position1= (position1 - dieThrow1);
//			 		position2 =(position2 - dieThrow2);
			 		
			 		if (position1<0 )
			 		{
			 			position1 =(position1 + dieThrow1);
//			 			position2 =(position2 + dieThrow2);
			 			
			 			}
			 		 }
				 break;
	
			 }
			 
			 
			 

			 if (position1==100) 
			 {
			 System.out.println("Player1 reached position 100 and player1 wins !! ");
			 System.out.println("position after die throw is "  + position1);
//			 System.out.println("total count of throw = " + countOfThrow );

			 break;
			 }
			 
			 else if (position1>100)
			 {
				 position1=position1-dieThrow1;
				 
			 }
			 
			 
//			 player 2 turn
			 
			 short options2= (short)(Math.random() * 3 + 1);
			 System.out.println("option2 is =" + options2);
			 
			 switch (options2)
			 {
			 
			 case (noplay):
				 {
			 		 }
			 break;
		 
			 case (ladder):
				 {
//			 		position1 =(position1 + dieThrow1);
			 		position2 =(position2 + dieThrow2);
//			 		int dieThrow1a= (int)(Math.random() * 6 + 1);
//			 		short options2a= (short)(Math.random() * 3 + 1);
			 		
//			 		System.out.println("current position of player 2 before replay : " + position2);
			 		System.out.println("Since ladder its player twos turn");
			 		position2=options(position2);
//			 		System.out.println("current position of player2 after replay =" + position2);
			 		
				 }
			 break;
			 
			 case (snake):
				 {
//			 		position1= (position1 - dieThrow1);
			 		position2 =(position2 - dieThrow2);
			 		
			 		if (position2<0)
			 		{
//			 			position1 =(position1 + dieThrow1);
			 			position2 =(position2 + dieThrow2);
			 			
			 			}
			 		 }
				 break;
	
			 }
			 
			 

			 if (position2==100) 
			 {
			 System.out.println("Player2 reached position 100 and player2 wins !! ");
			 System.out.println("position after die throw is "  + position2);
//			 System.out.println("total count of throw = " + countOfThrow );

			 break;
			 }
			 
			 else if (position2>100)
			 {
				 position2=position2-dieThrow2;
				 
			 }
			 
			 
			 
			 
			 
			 
		 
			 

			 
			 
			 
		 System.out.println("position1 after die throw is "  + position1);
//		 System.out.println("total count of throw = " + countOfThrow );
		 System.out.println("position2 after die throw is "  + position2);

		 }
		 
		 
		     }
		 
		 
		     
		     

		     
		     
		     
		     
		     
		     
		         static int options(int position)
		          {
		        	  	 final short noplay=1;
						 final short ladder=2;
						 final short snake=3;
						 int dieThrow= (int)(Math.random() * 6 + 1);
						 short options= (short)(Math.random() * 3 + 1);
						 

		 			 switch (options)
		 			 {
		 			 
		 			 case (noplay):
		 				 {
		 			 		 }
		 			 break;
		 		 
		 			 case (ladder):
		 				 {
		 			 		position =(position + dieThrow);
//		 			 		position2 =(position2 + dieThrow2);
//		 			 		System.out.println("inside function option current position :"+ position);
		 			 		position=options(position);
//		 			 		System.out.println("inside function option current position after replaying again :"+ position);
		 			 		
		 			 		
		 				 }
		 			 break;
		 			 
		 			 case (snake):
		 				 {
		 			 		position= (position - dieThrow);
//		 			 		position2 =(position2 - dieThrow2);
		 			 		
		 			 		if (position<0 || position<0)
		 			 		{
		 			 			position =(position + dieThrow);
//		 			 			position2 =(position2 + dieThrow2);
		 			 			
		 			 			}
		 			 		 }
		 				 break;
		 	
		 			 }
		 			 	
		 			 	return position;
		 			 
		        	   }
		           
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		 

}




	
	



