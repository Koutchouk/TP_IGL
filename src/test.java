
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tata[] = {0,1,2,3,4,5,6,7,8,9};
		VectorHelper vh = new VectorHelper(tata);
		vh.inverserTab();
		System.out.println(tata[0]);
		vh.minMax();
		System.out.println(vh.min+"\n" + vh.max);
		
		
	}

}
