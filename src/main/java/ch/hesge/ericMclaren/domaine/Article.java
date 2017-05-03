package ch.hesge.ericMclaren.domaine;

/**
 * Module 633.1-Programmation / TP P11
 * 
 * Vente de matériel de ski
 * 
 * Représentation d'un Article
 * 
 * Les données sont en lecture seule (une fois un Article instancié, il ne peut pas être modifié)
 * 
 * @author Eric
 * @author Cheng John COUCOU
 */
public class Article implements Comparable {
    
  public static final String MONNAIE = "CHF";

  private int id;              /* Identifiant */
  private String designation;  /* Désignation de l'article */
  private double prix;         /* Prix unitaire de l'article */

  public Article (int id, String designation, double prix) {
    this.id = id;
    this.designation = designation;
    this.prix = prix;
  } // Constructeur

  /* Accesseurs */
  public int getId () {return id;}
  public String getDesignation () {return designation;}
  public double getPrix () {return prix;}
  
  /** Deux Articles sont égaux si leurs identifiants sont identiques */
  public boolean equals (Object obj) {
    return id == ((Article)obj).id;
  } // equals  

  /** Le résultat de toString() est affiché dans la vue */
  public String toString () {
    return designation + " : (" + prix + " " + MONNAIE + ")";
  } // toString    

  /* Comparaison des articles dans l'ordre lexicographique, sans tenir compte de la casse */
  public int compareTo (Object obj) {
    Article article = (Article)obj;
    return this.designation.compareToIgnoreCase(article.designation);
  } // compareTo

} // Article
