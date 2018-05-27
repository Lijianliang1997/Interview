package ali;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by qq940 on 2018/3/4.
 */
public class Inter {
    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static void main(String[] args) {

        List<Integer> order = new ArrayList<Integer>();
        Map<String, List<Integer>> boms = new HashMap<String, List<Integer>>();

        Scanner in = new Scanner(System.in

        );
        String line = in.nextLine();

        Integer n = Integer.parseInt(line.split(",")[0]);
        Integer m = Integer.parseInt(line.split(",")[1]);

        line = in.nextLine();
        String[] itemCnt = line.split(",");
        for(int i = 0; i < n ; i++){
            order.add(Integer.parseInt(itemCnt[i]));
        }

        for(int i = 0; i < m; i++){
            line = in.nextLine();
            String[] bomInput = line.split(",");
            List<Integer> bomDetail = new ArrayList<Integer>();

            for(int j = 1; j <= n; j++ ){
                bomDetail.add(Integer.parseInt(bomInput[j]));
            }
            boms.put(bomInput[0], bomDetail);
        }
        in.close();

        Map<String, Integer> res = resolve(order, boms);

        System.out.println("match result:");
        for(String key : res.keySet()){
            System.out.println(key+"*"+res.get(key));
        }
    }

    // write your code here
    public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {
        Map<String, Integer> res = new HashMap<>();
        Map<String, Integer> sumMap = new TreeMap<>();
        int total = 0;
        for (Integer num : order) {
            total += num; //求出商品种数
        }
        Iterator iter = boms.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String bom = (String )entry.getKey();
            List<Integer> bomDetail = (List)entry.getValue();
            int sum = 0;
            for (int i = 0; i < bomDetail.size(); i ++) {
                sum += bomDetail.get(i);
            }
            sumMap.put(bom, sum);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(sumMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }); // 将各个方案所需的所有商品个数从大到小排列
        while (total > 0) {
            for (Map.Entry entry : list) {
                if (total > (Integer) entry.getValue()) {
                    int num = total / (Integer) entry.getValue();
                    res.put((String)entry.getKey(), num);
                    total = total % (Integer)entry.getValue();
                }
            }
        }
        return res;
    }
}
