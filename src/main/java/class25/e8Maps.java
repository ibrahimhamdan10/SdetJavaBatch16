package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class e8Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> ranks=new LinkedHashMap<>();
        ranks.put(1,"james");
        ranks.put(2,"ibrahim");
        ranks.put(3,"khaled");
        ranks.put(4,"ghada");
        System.out.println(ranks);
        ranks.remove(2);
        System.out.println(ranks);
        ranks.replace(1,"hamdan");
        System.out.println(ranks);

    }
}
