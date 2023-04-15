import java.util.ArrayList;
import java.util.List;

public class IntegerDecorator {
    private IntegerReader integerReader;

    private static final List<IntegerReader> cache = new ArrayList<>();
    public IntegerDecorator(Integer integer){
        for (IntegerReader reader : cache) {
            if (reader.getInteger().equals(integer)){
                int i = cache.indexOf(reader);
                this.integerReader = reader;
            }
        }
        if (this.integerReader == null){
            this.integerReader = new IntegerReader(integer);
            cache.add(integerReader);
        }
    }

    public Integer valueOf() {
        for (IntegerReader reader : cache) {
            if (reader.equals(integerReader)){
                int i1 = cache.indexOf(reader);
                return cache.get(i1).getInteger();
            }
        }
        return integerReader.getInteger();
    }
}
