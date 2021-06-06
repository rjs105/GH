import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class StartHere {
    public static void main(String[] args) {
        System.out.println(("foo"));

        try {
            Document doc = Jsoup.connect("https://order.pxsweb.com/menu/ghminnetonka#sandwiches").get();

            System.out.println(doc.body());
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
