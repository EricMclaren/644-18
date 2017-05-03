package ch.hesge.ericMclaren.base;

import ch.hesge.ericMclaren.domaine.Article;
import java.util.ArrayList;
import java.util.StringTokenizer;
import ch.hesge.ericMclaren.outils.FileStr;

/**
 * Module 633.1-Programmation / TP P11
 *
 * Vente de matériel de ski
 *
 * Lecture des données
 *
 * @author Eric
 */
public class ArticleDao {

    /* Lit les informations des Articles depuis le fichier nomF et retourne une ArrayList d'instances d'Article
     Format du fichier de données (séparateur ";"):
     id;Désignation;Prix  */
    public static ArrayList getListeArticles(String nomF) {
        ArrayList al = new ArrayList();
        String[] articles = FileStr.read(nomF);
        for (int i = 0; i < articles.length; i++) {
            StringTokenizer st = new StringTokenizer(articles[i], ";");
            int id = Integer.parseInt(st.nextToken());
            String designation = st.nextToken();
            double prix = Double.parseDouble(st.nextToken());
            al.add(new Article(id, designation, prix));
        }
        return al;
    } // getListeArticles

} // ArticleDao
