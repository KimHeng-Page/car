package json.acess_modifer;
public class protect_modifter {
    class products {
        String name;
        String type;
        String color;
        int price;
        int discount = price * 10 /100;
    }

    class  productDetail extends products{
        void showDetail(){
            name = "Apple";
            type = "Fruit";
            color = "Red";
            price = 1;
            System.out.println("======= Information of Product =======");
            System.out.println(". Name: " + name);
            System.out.println(". Type: " + type);
            System.out.println(". Color: " + color);
            System.out.println(". Price: " + price + " USD");
            System.out.println(". Discount: " + discount + " USD");
            System.out.println("======================================");
        }
    }
    public static void main(String[] args){
        System.out.println("Furits are good for health!");
        protect_modifter show = new protect_modifter();
        productDetail Show = show.new productDetail();
        Show.showDetail();
    }
}
