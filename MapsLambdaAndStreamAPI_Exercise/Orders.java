import java.util.*;
public class Orders {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            Map<String, List<Double>> priceList=new LinkedHashMap();

            String input=scanner.nextLine();

            while (!input.equals("buy")){
                String[] orders=input.split(" ");
                String name=orders[0];
                double price=Double.parseDouble(orders[1]);
                double quantity=Double.parseDouble(orders[2]);
                if (!priceList.containsKey(name)){
                    priceList.put(name, new ArrayList<>());
                    priceList.get(name).add(quantity);
                    priceList.get(name).add(price);
                } else {
                    double currentQuantity=priceList.get(name).get(0);
                    if (!priceList.get(name).get(1).equals(price)){
                        priceList.get(name).set(1,price);
                        priceList.get(name).set(0,quantity+currentQuantity);
                    } else {
                        priceList.get(name).set(0,quantity+currentQuantity);
                    }
                }

                input= scanner.nextLine();
            }
            priceList.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(0)*
                    entry.getValue().get(1)));
        }
}
