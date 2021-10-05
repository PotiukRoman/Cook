import com.isg.employee.Cook;
import com.isg.faults.CookBusyException;

public class Main {
    public static void main(String[] args) throws CookBusyException {
        Cook cook=new Cook("Василь",3);

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        cook.getWaterFromTheSupplier();

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        cook.getProductsFromSupplier();

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }

        try {
            cook.toCookADish();
        }catch (CookBusyException e){
            System.out.println(e.getMessage());
        }
    }
}
