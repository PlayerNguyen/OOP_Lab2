package question04;

import java.util.ArrayList;
import java.util.Collection;

public class ArbitraryRandomize<T> {

    private ArrayList<T> items = new ArrayList<>();

    public ArbitraryRandomize() {
    }

    public ArbitraryRandomize(Collection<T> items) {
        this.items = new ArrayList<>(items);
    }

    public T random() {
        int index = MathHelper.randomInt(0, items.size() - 1);
        return items.get(index);
    }

}
