import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class EspritVecto implements University{
	private Vector<Etudiant> espritVector=new Vector();
	@Override
	public void ajouterEtudiant(Etudiant e) {
		this.espritVector.add(e);
	}
	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		return this.espritVector.contains(e);
	}
	public boolean rechercherEtudiant(String nom) {
		for (Etudiant e:this.espritVector) {
			if (e.getNom()==nom)
				return true;
		}
		return false;
	}
	public void supprimerEtudiant(Etudiant e) {
		this.espritVector.remove(e);
	}
	public void displayEtudiants() {
		System.out.println(this.espritVector);
	}
	public void trierEtudiantsParId() {
		Collections.sort(espritVector,new Critddesortid());
	}
	public void trierEtudiantsParNom() {
		
		Collections.sort(espritVector,new CritdesortAge());
	}
}
