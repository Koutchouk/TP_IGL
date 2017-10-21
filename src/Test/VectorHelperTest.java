package Test;
import static org.junit.Assert.*;
import Main.*;
import org.junit.Test;
public class VectorHelperTest {


	@Test
	public void testTriBulle() {
		int vector[]={123,2256,12,15,0,1,2,36,18,19999};
		VectorHelper vh=new VectorHelper(vector);
		int result[]={0,1,2,12,15,18,36,123,2256,19999};
		
		vh.triBulle();
		assertArrayEquals(result,vh.getMyVector());
	}

	@Test
	public void testEchanger() {
		int vector[]={123,2256,12,15,0,1,2,36,18,19999};
		VectorHelper vh=new VectorHelper(vector);
		vh.echanger(vector, 0, 4);
		assertTrue((vector[0]==0)&&(vector[4]==123));
	}

	@Test
	public void testSommeVectors() throws TailleDifferentesException {
		int vector1[]={10,12,14,16,18,0,20,22,5};
		int vector2[]={11,13,15,17,19,1,21,23,6};
		int result[]={21,25,29,33,37,1,41,45,11};
		VectorHelper vh=new VectorHelper(vector1);
		assertArrayEquals(result,vh.SommeVectors(vh.getMyVector(), vector2));
	}
	
	@Test (expected=TailleDifferentesException.class)
	public void testTailleDifferentes(){
		int vector1[]=new int[10];
		int vector2[]=new int[15];
		assertFalse("Deux tableaux de taille differentes",vector1.length!=vector2.length);
	}
	

	@Test
	public void testInverserTab() {
		int vector[]={123,2256,12,15,0,1,2,36,18,19999};
		VectorHelper vh=new VectorHelper(vector);
		int result[]={19999,18,36,2,1,0,15,12,2256,123};
		vh.inverserTab();
		assertArrayEquals(result,vh.getMyVector());
		
		int vector2[]={0,0,0,0,0};
		vh.setMyVector(vector2);
		vh.inverserTab();
		assertArrayEquals(vector2,vh.getMyVector());
		
	}

	@Test
	public void testMinMax() {
		int vector[]={123,2256,12,15,0,1,2,36,18,19999};
		VectorHelper vh=new VectorHelper(vector);
		int minExpected=0,maxExpected=19999;
		vh.minMax();
		assertTrue((vh.getMin()==minExpected)&&(vh.getMax()==maxExpected));
	}

	

	@Test
	public void testFormule() {
		int vector[]={0,1,2,3,4,5,6,7,8,9,10};
		int vectorResult[]={0,2,4,6,8,10,12,14,16,18,20};
		VectorHelper vh=new VectorHelper(vector);
		vh.formule();
		assertArrayEquals(vh.getMyVector(),vectorResult);
	}

}
