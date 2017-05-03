package ch.hesge.ericMclaren.presentation;

/**
 * 634.1 Programmation - TP P03
 * 
 * Programme principal de l'application de gestion des activités
 *
 * @author Peter DAEHNE - HEG Genève
 * @version 1.0
 */
public class Main {
  
    private static final String ARTICLES = "Articles.txt"; /* Nom du fichier de donn�es */
    
    public static void main (String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {new MainFrm(ARTICLES).setVisible(true);}
        });
    } // main
  
} // Main
