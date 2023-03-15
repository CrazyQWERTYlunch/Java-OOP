package Homework4;

import Homework4.gb.list.GBLinkedList;

public class Controller {
    public static void initGBLinkedInt() {
        GBLinkedList<Integer> zxc = new GBLinkedList<>();
        System.out.println(zxc.size());
        zxc.add(6);
        zxc.addFirst(5);
        zxc.addLast(4);
        zxc.add(3);
        zxc.addAtPos(2,2);
        zxc.addAtPos(0,2);
        zxc.addAtPos(5,2);
        zxc.addAtPos(6,2);
        zxc.addLast(4);
        zxc.addFirst(99);

        showLinked(zxc);

        zxc.removeLast();
        zxc.removeFirst();
        zxc.removeAtPos(2);
        System.out.println();

        showLinked(zxc);
    }
    public static void initGBLinkedStr() {
        GBLinkedList<String> texts = new GBLinkedList<>();

        System.out.println(texts.size());

        texts.addFirst("");
        texts.addLast("эта реализация");
        texts.addAtPos(2,"2");
        texts.addAtPos(0,"фыв");
        texts.addAtPos(4,"внушает");
        texts.add("ужас");
        texts.addLast("!");
        texts.addFirst("О нет,");
        texts.add("привет");

        showLinked(texts);

        texts.removeLast();
        texts.removeFirst();
        texts.removeAtPos(3);

        showLinked(texts);
    }

    private static <T> void showLinked(GBLinkedList<T> zxc){
        zxc.getFirst();
        zxc.getLast();
        for (int i = 0; i < zxc.size();i++){
            zxc.getByIndex(i);
        }
    }


}
