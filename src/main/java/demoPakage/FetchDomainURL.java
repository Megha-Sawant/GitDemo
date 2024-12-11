package demoPakage;

import java.net.MalformedURLException;
import java.net.URL;

public class FetchDomainURL
{
    public static void main(String [] args) throws MalformedURLException {
        String url ="https://www.amazon.in/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2";

        URL url1 = new URL(url);
        String host =url1.getHost();
        System.out.println(host);
        String a[]=host.split("\\.");
        System.out.println(a[1]);

    }

}
