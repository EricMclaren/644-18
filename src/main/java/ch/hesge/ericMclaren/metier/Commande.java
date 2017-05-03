package ch.hesge.ericMclaren.metier;

import ch.hesge.ericMclaren.domaine.Article;

/**
 * Module 633.1-Programmation / TP P11
 * 
 * Vente de matériel de ski
 * 
 * L'Article qui fait l'objet de la Commande est en lecture seule (une fois une Commande instanciée, l'Article ne peut pas être modifié)
 * La quantité peut être ajustée selon la commande
 * 
 * @author Peter DAEHNE - HEG-Genève
 * @version Version 3.0 - 15.12.2016
 */
public class Commande implements Comparable {
    
  private Article article; /* Référence de l'article qui fait l'objet de la commande: identifiant */
  private int qte;         /* Quantité: nombre d'unités commandées */

  public Commande (Article article, int qte) {
    this.article = article;
    this.qte = qte;
  } // Constructeur

  /* Accesseurs */
  public Article getArticle () {return article;}
  public int getQte () {return qte;}
  public void setQte (int qte) {this.qte = qte;}
  public void incQte (int qteSuplementaire) {this.qte += qteSuplementaire;}
  public double getTotal(){return article.getPrix() * qte;}

  /** Deux commandes sont identiques si elles portent sur le même Article */
  public boolean equals (Object obj) {
    return article.equals(((Commande)obj).article);
  } // equals

  /** Le résultat de toString() est affiché dans la vue */
  public String toString () {
    return qte + " x " + article.toString() + " = " + (article.getPrix() * qte) + " " + Article.MONNAIE;
  } // toString

  /** L'ordre des commandes est l'ordre des articles */
  public int compareTo (Object obj) {
    return article.compareTo(((Commande)obj).article);
  } // compareTo


} // Commande
