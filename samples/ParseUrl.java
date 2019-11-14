import java.io.IOException;
import java.util.Arrays;

/**
 * Parse url using string functions.
 */
public class ParseUrl {
    public static void main(String[] args) throws IOException {
        String url = "https://mebelbor.ru/kukhni/kukhonnyy_garnitur_simpl_17002k/?utm_source=market.yandex.ru&utm_medium=market.yandex.ru&utm_term=market.yandex.ru&utm_content=market.yandex.ru&utm_campaign=market.yandex.ru&roistat=yamarket17_21557016_3960&frommarket=https%3A%2F%2Fmarket.yandex.ru%2Fcatalog--gotovye-komplekty-mebeli%2F55135%2Flist%3Fhid%3D7286147&ymclid=15737408663602677931600001";

        int qPos = url.indexOf('?');

        if (-1 == qPos) {
            System.out.println("URL doen't has query parameters");
            return;
        }

        String queryStr = url.substring(qPos + 1);

        String[] qArr = queryStr.split("&", -1);

        for (String s : qArr) {
            String[] pArr = s.split("=", -1);
            if (1 == pArr.length) {
                System.out.println("name=" + pArr[0]);
            } else if (2 == pArr.length) {
                System.out.println("name=" + pArr[0] + ", value=" + pArr[1]);
            } else {
                System.out.println(Arrays.toString(pArr));
            }
        }
    }
}
