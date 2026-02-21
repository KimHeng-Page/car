package json.acess_modifer;
public class default_modifter {
    class Province {
        String City;
        String District;
        String Commune;
        String Village;

        void ShowDetail(){
            City = "Siem Reap";
            District = "Siem Reap";
            Commune = "Svay Dangkum";
            Village = "Phum Svay Dangkum";

            System.out.println("======= Information of Province =======");
            System.out.println(". City: " + City);
            System.out.println(". District: " + District);
            System.out.println(". Commune: " + Commune);
            System.out.println(". Village: " + Village);
            System.out.println("=======================================");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Cambodia!");
        default_modifter show = new default_modifter();
        Province siemreap = show.new Province();
        siemreap.ShowDetail();
    }
}
