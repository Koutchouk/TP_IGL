
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tata[] = {0,1,2,3,4,5,6,7,8,9};
		VectorHelper vh = new VectorHelper(tata);
		vh.inverserTab();
		System.out.println(tata[0]);
		vh.minMax();
		System.out.println(vh.min+"\n" + vh.max);
		
		vh.triBulle(vh.myVector);
		int i=0;
		while (i<vh.myVector.length){
			System.out.print(vh.myVector[i]+" ");
			i++;
		}
		 
		System.out.println();
		int vector2[]={0,1,2,3,4,5,6,7,8,9};
		VectorHelper vh1=new VectorHelper(vector2);
		int Result[]=new int[tata.length];
		try {
			Result=vh.SommeVectors(tata, vector2);
			i=0;
			while (i<vh.myVector.length){
				System.out.print(Result[i]+" ");
				i++;
			}
		} catch (TailleDifferentesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
