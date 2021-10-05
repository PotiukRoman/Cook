package com.isg.employee;
import com.isg.faults.CookBusyException;

public class Cook {
    String name;
    boolean isWaterEnough;
    boolean isIngredientsForCooking;
    int maxCookedMealsPerDay;
    int currentDishes=0;

    public Cook(String name, int maxCookedMealsPerDay){
        this.name=name;
        this.maxCookedMealsPerDay=maxCookedMealsPerDay;
    }

    public void toCookADish() throws CookBusyException {
        System.out.println("Замовник -> Офіціант, принесіть мені якусь мою улюблену страву");
        if( (currentDishes!=maxCookedMealsPerDay) & isIngredientsForCooking & isWaterEnough){
            currentDishes++;
            System.out.println("Офіціант -> так звичайно, кухар "+this.name+" уже готує для вас, сьогодні він приготував загалом "+ currentDishes+" стра(в/у/ви), він ще має силу приготувати для вас");
        }else if(currentDishes==maxCookedMealsPerDay){
            throw new CookBusyException("Kухар "+this.name+" відпочиває, він уже виконав норму приготування на день "+ this.maxCookedMealsPerDay+" стра(в/у/ви)");
        }else {
            throw new CookBusyException("Офіціант -> Почекайте кухар " +this.name+" зайнятий, займається отриманням продуктів або води від постачальників");
        }
    }

    public void getProductsFromSupplier(){
        System.out.println("Кухар " +this.name+ " -> Продукти від постачальника отримано");
        isIngredientsForCooking=true;
    }

    public void getWaterFromTheSupplier(){
        System.out.println("Кухар " +this.name+ " -> Воду від постачальника отримано");
        isWaterEnough=true;
    }
}
