package domaine;

import ch.hesge.ericMclaren.domaine.Article;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestArticles {

    @Test
    public void testArticle(){
        Article article = new Article(1, "designation", 10);
        assertEquals(article.getPrix(), 10d);
    }
    
}
