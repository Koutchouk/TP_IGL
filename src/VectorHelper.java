
public class VectorHelper {
	int myVector[];
	int min,max;
	
	
	
	public VectorHelper(int[] tab) {
		myVector = tab;
	}

    //Tri d'un vecteur .. 
	
	 public void triBulle(int Vector[])
     {
     boolean inversion;
     
     do
         {
         inversion=false;

         for(int i=0;i<Vector.length-1;i++)
             {
             if(Vector[i]>Vector[i+1])
                 {
                 echanger(Vector,i,i+1);
                 inversion=true;
                 }
             }
          }
     while(inversion);
     }
	 
	 public void echanger(int [] Vector, int i, int j){
			int tabj=Vector [j];
			Vector [j]=Vector [i];
			Vector [i]=tabj;
		}
	
	//Somme de deux vecteurs .. 
	 
	 public int[] SommeVectors(int Vector1[],int Vector2[]) throws TailleDifferentesException{
			
			int VectorResult[]=new int[Vector1.length];
			int i=0;
			if(Vector1.length==Vector2.length){
				while (i<Vector1.length){
					VectorResult[i]=Vector1[i]+Vector2[i];
					i++;
				}
			}
			else throw new TailleDifferentesException();
			return VectorResult;
		}
	 
	 //Inversion des elements d'un vecteur .. 
	 
	 void inverserTab(){
		int x,i=0;
		while (i< (myVector.length / 2)){
			x= myVector[i];
			myVector[i]=myVector[myVector.length -1 - i];
			myVector[myVector.length -1 - i] = x;
			i++;
		}
	}
	
	//Le min et le max d'un vecteur simultanement .. 
	 
	void minMax(){
		int i=1;
		min = max = myVector[0];
		while (i<myVector.length){
			if(myVector[i]<min) min = myVector[i];
			else if(myVector[i]>max) max = myVector[i];
			i++;
		}
	}
	
	
	//Appliquer une formule sur les elements d'un vecteur  .. 
	
	void multi2(int x){
		x=x*2;
	}
	
	void formule(){
		for(int i =0; i<myVector.length ; i++){
			multi2(myVector[i]);
		}
	}
	
	
	
	
	
}
