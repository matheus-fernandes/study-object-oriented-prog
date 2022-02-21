package patterns.facade.options;

import patterns.facade.beverages.Beverage;

import java.util.Map;
import java.util.function.Supplier;

public class BeverageEntryFactory<T extends Beverage> implements EntryFactory<T>{
    protected String key;
    protected Supplier<T> beverageSupplier;

    public BeverageEntryFactory(String key, Supplier<T> beverageSupplier){
        this.key = key;
        this.beverageSupplier = beverageSupplier;
    }

    @Override
    public Map.Entry<String, T> getEntry() {
        return Map.entry(key, beverageSupplier.get());
    }
}