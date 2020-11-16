import java.util.Comparator;

public class Critddesortid implements Comparator{
	
@Override
public int compare(Object o1,Object o2) {
	Etudiant e1=(Etudiant)o1;
	Etudiant e2=(Etudiant)o2;
	if (e1.getId()<e2.getId())
		return -1;
	else if (e1.getId()>e2.getId())
		return 1;
	else 
		return 0;
}
}
