import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class EspritArrayList implements University{
	private ArrayList<Etudiant> espritArrayList=new ArrayList();
	
	public EspritArrayList() {
		
	}
	public void ajouterEtudiant(Etudiant e) {
		this.espritArrayList.add(e);
	}
	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		return this.espritArrayList.contains(e);
	}
	public boolean rechercherEtudiant(String nom) {
		for (Etudiant e:this.espritArrayList) {
			if (e.getNom()==nom)
				return true;
		}
		return false;
	}
	public void supprimerEtudiant(Etudiant e) {
		this.espritArrayList.remove(e);
	}
	public void displayEtudiants() {
		System.out.println(this.espritArrayList);
	}
	public void trierEtudiantsParId() {
		Collections.sort(espritArrayList,new Critddesortid());
	}
	public void trierEtudiantsParNom() {
		
		Collections.sort(espritArrayList,new CritdesortAge());
	}
}
