package mico;
import java.sql.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MenuDeletion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://db4free.net:3306/restol";
        String username = "halima";
        String password = "Mouad@2001";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // Saisie de l'ID de l'élément à supprimer
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez l'ID de l'élément à supprimer : ");
            int itemId = scanner.nextInt();

            // Préparation de la requête de suppression
            String query = "DELETE FROM menu_items WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, itemId);

            // Exécution de la requête de suppression
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("L'élément a été supprimé avec succès !");
            } else {
                System.out.println("Aucun élément correspondant à l'ID spécifié n'a été trouvé.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
