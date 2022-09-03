package bl.com.day4practiceproblems;

public class SnakeAndLadder {
	
	
	
	public static void main(String[] args) {
	
	System.out.println("---Welcome to Snake and Ladder Simulator---");
	
	System.out.println(	"Snake and Ladder game played with single player at start position 0");
	
	 
	Firstthrow(); 
	
	System.out.println("Ensuring player gets to exact winning position 100");
	oneplayersimulator();
	 
	}
	
	
				static void Firstthrow() 
				{
					 
					 int position=0;
//					 short options= (short)(Math.random() * 3 + 1);
//					 System.out.println("option is =" + options);
					 final short noplay=1;
					 final short ladder=2;
					 final short snake=3;
					 int countOfThrow=0;
					 
					int dieThrow= (int)(Math.random() * 6 + 1);
					 System.out.println("dieThrow is =" + dieThrow);
					 countOfThrow ++;
//					 System.out.println("total count of throw = " + countOfThrow );
					 
					 short options= (short)(Math.random() * 3 + 1);
					 System.out.println("option is =" + options);
					 
					 
					 switch (options)
					 {
					 
					 case (noplay):
						 {
					 		 }
					 break;
				 
					 case (ladder):
						 {
					 		position =(position + dieThrow);
						 }
					 break;
					 
					 case (snake):
						 {
					 		position= (position - dieThrow);
					 		
					 		if (position<0)
					 		{
					 			position =(position + dieThrow);
					 			
					 			}
					 		 }
						 break;
			
					 }
					
					System.out.println("position after first throw : " + position );
					
					
						
				}
	
	
					static void oneplayersimulator()
					{   
						
						 
						 int position=0;
//						 short options= (short)(Math.random() * 3 + 1);
//						 System.out.println("option is =" + options);
						 final short noplay=1;
						 final short ladder=2;
						 final short snake=3;
						 int countOfThrow=0;
						 
						
						while (position<=100)
						 {
							 int dieThrow= (int)(Math.random() * 6 + 1);
							 System.out.println("dieThrow is =" + dieThrow);
							 countOfThrow ++;
//							 System.out.println("total count of throw = " + countOfThrow );
							 
							 short options= (short)(Math.random() * 3 + 1);
							 System.out.println("option is =" + options);
							 
							 
							 switch (options)
							 {
							 
							 case (noplay):
								 {
							 		 }
							 break;
						 
							 case (ladder):
								 {
							 		position =(position + dieThrow);
								 }
							 break;
							 
							 case (snake):
								 {
							 		position= (position - dieThrow);
							 		
							 		if (position<0)
							 		{
							 			position =(position + dieThrow);
							 			
							 			}
							 		 }
								 break;
					
							 }
							 
							 
						
							 if (position==100)
							 {
							 System.out.println("Player reached position 100 and player wins !! ");
//							 System.out.println("position after die throw is "  + position);
//							 System.out.println("total count of throw = " + countOfThrow );

							 break;
							 }
							 
							 else if (position>100)
							 {
								 position=position-dieThrow;
								 
							 }
							 
//						 System.out.println("position after die throw is "  + position);
//						 System.out.println("total count of throw = " + countOfThrow );

						 }

					}
						
						
						
						
					}
				
				
				
				
				
				
				
				
				
				
	
	
	
	


