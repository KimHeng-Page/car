package collection;

public class Main {
    public static void main(String[] args){
        Student sent = new Student("Sokha", "Phom Phen", "Computer Science", 2, 1800.50);

        Staff send  = new Staff("Chantha", "SiemReap", "Faculty of Engineering", 950.70);

        System.out.println(sent);
        System.out.println(send);

        sent.setYear(3);
        sent.setFee(1950.00);
        send.setPay(1050.00);

        System.out.println("\nafter changes: ");
        System.out.println(sent);
        System.out.println(send);

        System.out.println("\n just name and address");
        System.out.println("student name: " + sent.getName());
        System.out.println("staff address: " + send.getAddress());
    }
}
