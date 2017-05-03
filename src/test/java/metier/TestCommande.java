package metier;

import ch.hesge.ericMclaren.domaine.Article;
import ch.hesge.ericMclaren.metier.Commande;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeMethod;

public class TestCommande {
    
    private Commande commande;
    
    @BeforeMethod
    public void setUp(){
        commande = new Commande(new Article(1, "Article", 10), 2);
    }
    
    @Test
    public void commandeTestCommande(){
        assertEquals(commande.getTotal(), 20d);
    }
    
    @Test
    public void commandeIncTest(){
        commande.incQte(1);
        assertEquals(commande.getTotal(), 30d);
    }
    
    
}
