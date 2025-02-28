package net.lilith.test;

import java.util.Comparator;

public record ComparableRecord(String exampleString, int exampleInt) implements Comparable<ComparableRecord> {
    @Override
    public int compareTo(ComparableRecord o) {
        return Comparator.comparing(ComparableRecord::exampleString).thenComparing(ComparableRecord::exampleInt).compare(this, o);
    }
}
