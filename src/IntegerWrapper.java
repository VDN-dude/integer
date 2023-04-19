import java.util.HashMap;
import java.util.Map;

public class IntegerWrapper {
    private final Integer integer;

    private static final Map<Integer,IntegerWrapper> cache = new HashMap<>();

    private IntegerWrapper(Integer integer) {
        this.integer = integer;
    }

    public static IntegerWrapper valueOf(Integer integer) {
        if (cache.get(integer)!= null) {
            return cache.get(integer);
        } else {
            IntegerWrapper integerWrapper = new IntegerWrapper(integer);
            cache.put(integer, integerWrapper);
            return integerWrapper;
        }
    }

    public Integer getInteger() {
        return integer;
    }
}
