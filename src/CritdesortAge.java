import java.util.Comparator;

public class CritdesortAge implements Comparator{

	
	
	
	
@Override
public int compare(Object o1,Object o2) {
	Etudiant e1=(Etudiant)o1;
	Etudiant e2=(Etudiant)o2;
	char ch1=e1.getNom().charAt(0);
	int ascii1=ch1;
	char ch2=e2.getNom().charAt(0);
	int ascii2=ch2;
	if (ascii1<ascii2)
		return -1;
	else if (ascii1>ascii2)
		return 1;
	else 
		return 0;
}

}
