package patterns.facade.options;

import patterns.facade.beverages.Beer;
import patterns.facade.beverages.Beverage;
import patterns.facade.beverages.Wine;

import java.util.Map;
import java.util.function.Supplier;

public enum BeverageOptions {
    WINE("wine", Wine::new),
    BEER("beer", Beer::new);

    BeverageEntryFactory factory;

    BeverageOptions(String key, Supplier<Beverage> beverageSupplier){
        this.factory = new BeverageEntryFactory<>(key, beverageSupplier);
    }

    public <T extends Beverage> Map.Entry<String, T> getOption(){
        return this.factory.getEntry();
    }
}