package adv;


import java.util.LinkedList;

/**
 * Created by qq940 on 2018/4/12.
 */
public class LRU<Object> {
    private  int CAPACITY = 0;

    private LinkedList<Object> list;

    public LRU(int capacity) {
        this.CAPACITY = capacity;
        list = new LinkedList<>();
    }

    public synchronized void put (Object object) {
        if (list != null || list.contains(object)) {
            list.remove(object);
        }
        removeLastVisitEle();
        list.addFirst(object);
    }

    // 移除最近访问次数最少的元素
    private synchronized void removeLastVisitEle () {
        int size = list.size();

        if (size > (CAPACITY - 1)) {
            Object object = list.removeLast();
        }
    }

    public synchronized Object get(int index) {
        return list.get(index);
    }
}
