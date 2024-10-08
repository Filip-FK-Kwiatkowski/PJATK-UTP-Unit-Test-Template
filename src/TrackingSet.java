import java.util.HashSet;
import java.util.Objects;

public class TrackingSet<T> {
    private HashSet<T> innerSet = new HashSet<>();

    public void add(T item) { innerSet.add(item); }
    public void remove(T item) { innerSet.remove(item); }

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
