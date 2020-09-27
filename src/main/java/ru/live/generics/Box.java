package ru.live.generics;

public class Box {

    private Object[] content;


    public Box(Object... content) {
        this.content = content;
    }

    public Object getByIndex(Integer i){
        return content[i];
    }

    public Object[] getContent() {
        return content;
    }
}
