/**
 *Cette classe a pour but de simplifier la manipulation des tableaux 
 * @author Kucuk/Kherbache
 *
 */
/*this was added to make changes on master Branch*/
/*this line was added to make a change in the new branch*/
public class VectorHelper {
	int myVector[];
	int min,max;
	

	
	/**
	 * Ce constructeur initialise le vecteur myVector avec un vecteur en entré
	 * @param tab : Le vecteur sur lequel on va travailler
	 */
	public VectorHelper(int[] tab) {
		myVector = tab;
	}

    
	/**
	 * TriBulle : sert prinicipalement a trier le tableau
	 * @param Vector : le tableau en question
	 */
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
	 
	/**
	 * Echanger : méthode qui échange le conteun de deux cases du tableau
	 * @param Vector : tableau en question
	 * @param i : indice de la premiere case
	 * @param j : indice de la deuxieme case
	 */
	 public void echanger(int [] Vector, int i, int j){
			int tabj=Vector [j];
			Vector [j]=Vector [i];
			Vector [i]=tabj;
		}
	
	/**
	 * SommeVectors : somme les élements de deux tableaux, lève une exception si les tailles des deux tabeaux sont inégales 
	 * @param Vector1 : Premier vecteur
	 * @param Vector2 : Deuxieme vecteur
	 * @return 
	 * @throws TailleDifferentesException
	 */
	 
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
	 
	 /**
	  * InverserTab : Inverse les éléments du tableau
	  */
	 
	 void inverserTab(){
		int x,i=0;
		while (i< (myVector.length / 2)){
			x= myVector[i];
			myVector[i]=myVector[myVector.length -1 - i];
			myVector[myVector.length -1 - i] = x;
			i++;
		}
	}
	
	/**
	 * minMax : retourne le min et le max d'un tableau
	 */
	 
	void minMax(){
		int i=1;
		min = max = myVector[0];
		while (i<myVector.length){
			if(myVector[i]<min) min = myVector[i];
			else if(myVector[i]>max) max = myVector[i];
			i++;
		}
	}
	/**
	 * myformule : une formule quelconque, initialisée à multip*2
	 * @param x : l'antécédent de la fonction
	 */
	void myformule(int x){
		x=x*2;
	}
	
	/**
	 * formule : applique la méthode formule sur les cases du tableau
	 */
	void formule(){
		for(int i =0; i<myVector.length ; i++){
			myformule(myVector[i]);
		}
	}
	
	
	
	
	
}
