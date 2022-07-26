package chapter12;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args){
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        var i = fruit.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}
}
