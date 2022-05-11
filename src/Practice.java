import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Practice {
    void run(int x) {
    System.out.println("inside funtion");

    }


    public static void main(String[] args) {
        Practice p = new Practice();
        String s = new String("");
        p.run(4);
        Map<Integer,Integer> a = new ConcurrentHashMap<>();
        Set<Integer> c = new TreeSet<>();
        Stack<Integer> d = new Stack<>();

        Queue<Integer> q = new PriorityQueue<>((u, v) ->{return  u-v;});
        List<Integer> list = new ArrayList<>();

        list.stream().filter(u->u==5).collect(Collectors.toList());

        Queue<Integer> q2 = new PriorityQueue<>(new comp());

    }

    static class comp implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }
}
