package lest;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Facture {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== GÉNÉRATEUR DE FACTURE ===\n");

        // Demande le nombre d'articles
        System.out.print("Nombre d'articles : ");
        int n = input.nextInt();

        // Création de la liste d'articles
        ArrayList<Article> articles = new ArrayList<>();

        // Saisie des articles
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Article " + (i+1) + " ---");

            // Demande les informations de l'article
            System.out.print("Numéro de l'article : ");
            int numero = input.nextInt();

            System.out.print("Désignation de l'article : ");
            String designation = input.next();

            System.out.print("Quantité de l'article : ");
            int quantite = input.nextInt();

            System.out.print("Prix unitaire de l'article : ");
            double prixUnitaire = input.nextDouble();

            // Ajout de l'article à la liste
            Article article = new Article(numero, designation, quantite, prixUnitaire);
            articles.add(article);
        }

        // Création de la facture en format PDF
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("facture.pdf"));
            document.open();

            // Titre de la facture
            Paragraph titre = new Paragraph("FACTURE\n\n", new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD));
            titre.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(titre);

            // Informations des articles
            for (int i = 0; i < n; i++) {
                Article article = articles.get(i);

                Paragraph p = new Paragraph();
                p.add("Article " + (i+1) + " :\n");
                p.add("Numéro de l'article : " + article.getNumero() + "\n");
                p.add("Désignation de l'article : " + article.getDesignation() + "\n");
                p.add("Quantité de l'article : " + article.getQuantite() + "\n");
                p.add("Prix unitaire de l'article : " + article.getPrixUnitaire() + "\n");
                p.add("Prix total de l'article : " + article.getPrixTotal() + "\n\n");

                document.add(p);
            }

            // Total TTC
            double totalTTC = 0;
            for (Article article : articles) {
                totalTTC += article.getPrixTotal();
            }
            DecimalFormat df = new DecimalFormat("0.00"); // Formatage du total
            Paragraph total = new Paragraph("TOTAL TTC : " + df.format(totalTTC) + " euros\n\n");
            total.setAlignment(Paragraph.ALIGN_RIGHT);
            document.add(total);

            document.close();
            writer.close();

            System.out.println("La facture a été générée en format");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        input.close();

    }

    // Classe pour représenter un article
    private static class Article {
        private int numero;
        private String designation;
        private int quantite;
        private double prixUnitaire;

        public Article(int numero, String designation, int quantite, double prixUnitaire) {
            this.numero = numero;
            this.designation = designation;
            this.quantite = quantite;
            this.prixUnitaire = prixUnitaire;
        }

        public int getNumero() {
            return numero;
        }

        public String getDesignation() {
            return designation;
        }

        public int getQuantite() {
            return quantite;
        }

        public double getPrixUnitaire() {
            return prixUnitaire;
        }

        public double getPrixTotal() {
            return quantite * prixUnitaire;
        }
    }
