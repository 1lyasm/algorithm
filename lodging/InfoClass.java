package org.ilyasmustafazade;

import java.util.List;

public class InfoClass {
    public static <T> void getObjectInfo(T obj) {
        System.out.println(obj);
    }

    public static <E> void getListInfo(List<E> list) {
        for (E item: list) {
            getObjectInfo(item);
        }
    }
}
