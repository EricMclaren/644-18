import ch.hesge.ericMclaren.presentation.MainFrm;

/**
 * Module 633.1-Programmation / TP P11
 * 
 * Vente de matériel de ski
 *
 * Classe principale de l'application.
 *
 * @author Peter DAEHNE - HEG-Genève
 * @version Version 3.0 - 15.12.2016
*/
public class Main {
  
  private static final String ARTICLES = "Articles.txt"; /* Nom du fichier de données */

  /* Ouverture de la fenêtre de gestion des équipes */
  public static void main (String args[]) {
    new MainFrm(ARTICLES).setVisible(true);
  } // main
  
} // Main
