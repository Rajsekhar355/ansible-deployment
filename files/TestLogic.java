import static org.junit.Assert.assertEquals;

import org.junit.Test;  

public class TestLogic {  

	@Test  
	public void testFindMax(){  
		assertEquals(4,findMax(new int[]{1,3,4,2}));  
		assertEquals(-1,findMax(new int[]{-12,-1,-3,-4,-2}));  
	}  

	public static int findMax(int arr[]){  
		int max=0;  
		for(int i=1;i<arr.length;i++){  
			if(max<arr[i])  
				max=arr[i];  
		}  
		return max;  
	}  
}  