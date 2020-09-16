package nextstep.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Entries {

    private final List<Entry> entries;

    private Entries(List<Entry> entries) {
        this.entries = entries;
    }

    private static void validate(List<Entry> entries) throws IllegalArgumentException {
        Set<Entry> set = new HashSet<>(entries);
        if (set.size() != entries.size()) {
            throw new IllegalArgumentException("중복된 이름이 있어요.");
        }
    }

    public int getPersonnel() {
        return entries.size();
    }

    public int getIndexByEntry(Entry entry) {
        return IntStream.range(0, entries.size())
                .filter(index -> getEntryByIndex(index).equals(entry))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 참여자 입니다."));
    }

    public Entry getEntryByIndex(int index) {
        return entries.get(index);
    }

    public static Entries of(List<String> names) {
        List<Entry> entries = names.stream()
                .map(Entry::of)
                .collect(Collectors.toList());
        validate(entries);
        return new Entries(entries);
    }
}