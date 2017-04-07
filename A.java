
public class A {

static int jumpCount(int input1, int input2, int[] input3){
	
	int jc=0;
	int slip=input1-input2;
	
	for(int i3:input3){
		
		while(i3>0){
			jc++;
			
			if(input1==i3)
				break;
			i3=i3-slip;
		}
		
	}
	
	
	return jc;
}
	
public static void main(String[] args) {
	int[] arr=new int[]{5,4,10};
	System.out.println(jumpCount(5,1,arr));
	
}


	
	
}
