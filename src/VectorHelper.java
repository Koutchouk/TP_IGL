
public class VectorHelper {
	int myVector[];
	int min,max;
	
	
	
	public VectorHelper(int[] tab) {
		myVector = tab;
	}


	void inverserTab(){
		int x,i=0;
		while (i< (myVector.length / 2)){
			x= myVector[i];
			myVector[i]=myVector[myVector.length -1 - i];
			myVector[myVector.length -1 - i] = x;
			i++;
		}
	}
	
	void minMax(){
		int i=1;
		min = max = myVector[0];
		while (i<myVector.length){
			if(myVector[i]<min) min = myVector[i];
			else if(myVector[i]>max) max = myVector[i];
			i++;
		}
	}
	
	void multi2(int x){
		x=x*2;
	}
	
	void formule(){
		for(int i =0; i<myVector.length ; i++){
			multi2(myVector[i]);
		}
	}
	
}
