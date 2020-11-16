
public class Main {

	public static void main(String[] args) {
		Etudiant E1=new Etudiant(3,"radhwene","elhafi");
		Etudiant E2=new Etudiant(4,"samir","elwafi");
		Etudiant E=new Etudiant();
		E.setId(5);
		E.setNom("rami");
		E.setPrenom("kasmi");
		
		System.out.println(E);
		
		System.out.println("l'objet "+E+E1+E.equals(E1));
		EspritArrayList list1 = new EspritArrayList();
		EspritVecto list2  = new EspritVecto();
		
		list1.ajouterEtudiant(E1);
		list1.ajouterEtudiant(E2);
		list1.ajouterEtudiant(E);
		
		list1.displayEtudiants();
		list1.trierEtudiantsParId();
		list1.displayEtudiants();
		list1.trierEtudiantsParNom();
		list1.displayEtudiants();
		
		System.out.println("calsse trouvé "+list1.rechercherEtudiant(E));
		System.out.println("calsse trouvé "+list1.rechercherEtudiant("samir"));
		list2.ajouterEtudiant(E1);
		list2.ajouterEtudiant(E2);
		list2.ajouterEtudiant(E);
		
		list2.displayEtudiants();
		list2.trierEtudiantsParId();
		list2.displayEtudiants();
		list2.trierEtudiantsParNom();
		list2.supprimerEtudiant(E);
		list2.displayEtudiants();
		
		System.out.println("calsse trouvé "+list2.rechercherEtudiant(E));
		System.out.println("calsse trouvé "+list2.rechercherEtudiant("bamir"));
		
		
	}

}
