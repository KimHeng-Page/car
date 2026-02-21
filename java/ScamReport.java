import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class ScamReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Scam Link Report System ===");

        System.out.print("Enter Scam Link (URL): ");
        String link = scanner.nextLine();

        System.out.print("Enter Scam Type (Phishing / Fake Shop / Investment / Other): ");
        String type = scanner.nextLine();

        System.out.print("Describe the Scam: ");
        String description = scanner.nextLine();

        String report = generateReport(link, type, description);

        saveToFile(report);

        System.out.println("\n✅ Scam report created successfully!");
        scanner.close();
    }

    private static String generateReport(String link, String type, String description) {
        return "SCAM REPORT\n"
                + "--------------------------\n"
                + "Date: " + LocalDateTime.now() + "\n"
                + "Scam Link: " + link + "\n"
                + "Scam Type: " + type + "\n"
                + "Description: " + description + "\n"
                + "--------------------------\n";
    }

    private static void saveToFile(String report) {
        try (FileWriter writer = new FileWriter("scam_report.txt")) {
            writer.write(report);
        } catch (IOException e) {
            System.out.println("❌ Error saving report: " + e.getMessage());
        }
    }
}
