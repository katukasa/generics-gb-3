package ru.live.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithNumbers<T extends Number> {

    private List<T> content;

    public BoxWithNumbers(T... content) {
        this.content = Arrays.asList(content);
    }

    public T getByIndex(Integer i){
        return content.get(0);
    }

    public List<T> getContent() {
        return content;
    }

    public Double sum(){
        Double base = 0.0;
        for (T t : content) {
            base += t.doubleValue();
        }

        return base;
    }

    public boolean compare(BoxWithNumbers<?> other){
        return sum().equals(other.sum());
    }

    public static <T extends Number> T firstElement(BoxWithNumbers<T> original){
        return original.getContent().get(0);
    }


}
