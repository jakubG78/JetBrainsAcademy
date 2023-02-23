import java.util.function.Supplier;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<Integer>() {
            Integer counter = 0;

            @Override
            public Integer get() {
                return counter++;
            }
        };
    }

}