package IntegerWorker;

import java.util.ArrayList;
import java.util.List;

public class IntegerDecorator {
    private IntegerWrapper integerWrapper;

    private static final List<IntegerWrapper> cache = new ArrayList<>();

    public IntegerDecorator(Integer integer) {
        for (IntegerWrapper reader : cache) {
            if (reader.getInteger().equals(integer)) {
                this.integerWrapper = reader;
            }
        }
        if (this.integerWrapper == null) {
            this.integerWrapper = new IntegerWrapper(integer);
            cache.add(integerWrapper);
        }
    }

    public Integer valueOf() {
        for (IntegerWrapper reader : cache) {
            if (reader.equals(integerWrapper)) {
                int i1 = cache.indexOf(reader);
                return cache.get(i1).getInteger();
            }
        }
        return integerWrapper.getInteger();
    }
}
