package day30_collections_is;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {
        Queue<String > q1 = new LinkedList<>();
        q1.add("A");

        System.out.println(q1); // [A]

        System.out.println(q1.offer("B"));//true and element will be inserted
        System.out.println(q1); // [A, B]

        // add method will throw exception, but offer method even when you have unlimited data, it will just give you false result
        // 4238dskjflkjlkwjakfgj;lsdj;glkjk;ldfjl;kghj;er8erio5ur;y9ter9ghu;ioueiot;ruyh985;ueyh;iteuihu;i5u9u  => add => throw exception
        // jsgdhjlksfhgjhlseruyghuureguhfusghkluleirstulhgklkdfjilghjliejrtslkjghkjdilsjlhigjlisetuhgiueitsuhiu => offer => false

        // This will be learnt while Lambda instructions
        Queue<String> q2 = new PriorityQueue<>();
    }
}