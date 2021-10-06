import com.isg.employee.Cook;
import com.isg.faults.CookBusyException;

public class Main {
    public static void main(String[] args) throws CookBusyException {
        Cook cook=new Cook("Василь",3);

        cook.ringer();
        cook.getWaterFromTheSupplier();
        cook.ringer();
        cook.getProductsFromSupplier();
        cook.ringer();
        cook.ringer();
        cook.ringer();
        cook.ringer();
        cook.ringer();





    }
}
