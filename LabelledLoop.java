
public class LabelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//With Labelled Loop
		
				int i, j;
				
				loop1: for(i = 1; i <= 5; i++)
				{
					loop2: for(j = 1; j <= 5; j++)
					{
						System.out.print(i);
						
						if(j == 5)
						{
							break loop1;
						}
					}
					System.out.println();
				}
		
		//Without Labelled Loop
		/*
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= 5; j++)
			{
				System.out.print(i);
				
				if(j == 5)
				{
					break;
				}
			}
			System.out.println();
		}*/

	}

}
