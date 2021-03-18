package personne;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class personneTestParameterized {
	
	
	private String nom;
	private String prenom;
	private String userIdAttendu;
	private int date;
	
	public personneTestParameterized(String nom,String prenom,int date,String userIdAttendu) {
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
		this.userIdAttendu = userIdAttendu;
	}
	
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}")
	public static Collection<Object[]> dt(){
		Object[][] data = new Object[][] {
			{"Dujardin","Jean",0,"dujarjeaXX"},
			{"DUJARDIN","JEAN",1968,"dujarjea68"},
			{"An","na",0,"annaXX"},
			{"Le Corre","éric",2000,"lecoreri00"}
		};
		return Arrays.asList(data);
	}

	@Test
	public void testPersonne() {
		Personne p = new Personne(this.nom,this.prenom,this.date);
		
		assertEquals(userIdAttendu,p.user_id());
	}
}
