package spo.sky.internetshop.model;

import java.util.List;
import java.util.Objects;

public class Element {
    private List<Integer> ids;

    public Element(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(ids, element.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
}
