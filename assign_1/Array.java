
//package index_array;

public class Array {
	private int array[];
	
	
	public Array(int size)
	{
		 array = new int[size];
		 for(int i = 0 ; i < array.length ; i++)
		 {
		 	
		 	array[i]=i;
		 
		 }
		
	}
	
	
	public void insert (int index, int element) {
		array[index] = element;
	}
	
	
	
	public void display() 
	{
		for(int i=0; i<= array.length-1;i++) 
		{
			System.out.println(array[i]);
		}
	}
	
	public void findMax()
	{
		
		int max = array[0];

		for( int i = 1 ; i <= array.length-1 ; i++)
		{
			if(max < array[i])
				max = array[i];
		}

		System.out.println("Max value in the array is: " + max);

	}
	
	public int addAllElems()
	{ 
	int sum=0;
	
	for( int i = 1 ; i <= array.length-1 ; i++)
		{
			
			sum+= array[i];
		}
	
	return sum;

	}	
	
	
	public void avgElems()
	{
	int sum = addAllElems();
	double avg = sum/(array.length);
	System.out.println("average of all values in the array is: " + avg);
	}
	
	public void evenOddElems()
	{
		System.out.println("all even numbers: ");
		for(int i = 0 ; i < array.length ; i++)
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]);
			}
		
		}
		
		
		System.out.println("all odd numbers: ");
		for(int j = 0 ; j < array.length ; j++)
		{
			if(array[j]%2!=0)
			{
				System.out.println(array[j]);
			}
		
		}
	
	}
	
}
