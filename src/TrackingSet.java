import java.util.HashSet;
import java.util.Objects;

public class TrackingSet<T> {
    private final HashSet<T> innerSet = new HashSet<>();

    private int additionsCount = 0;
    private int removalsCount = 0;

    public void add(T item) {
        innerSet.add(item);
        additionsCount += 1;
    }
    public void remove(T item) {
        innerSet.remove(item);
        removalsCount += 1;
    }

    public int getOperationsCount() {
        return getAdditionsCount() + getRemovalsCount();
    }

    public int getAdditionsCount() {
        return additionsCount;
    }

    public int getRemovalsCount() {
        return removalsCount;
    }

    @Override
    public String toString() {
        return innerSet.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackingSet<?> that = (TrackingSet<?>) o;
        return Objects.equals(innerSet, that.innerSet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(innerSet);
    }
}
