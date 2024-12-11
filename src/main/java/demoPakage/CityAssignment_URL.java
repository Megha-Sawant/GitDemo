package demoPakage;

public class CityAssignment_URL
{
    /*
We have collected some HTTP/HTTPS referrer URLs from our web server. This data can be found at the address https://public.karat.io/content/referrals_4.txt, where each line contains a URL and nothing else.

We want to learn more about the domains that refer traffic to our site.

Write code that reads the first URL in the log file and prints the full domain name and the last two pieces of the domain (usually this is the second level domain) from a given URL.

For this question, you can't use URL-parsing libraries.

Examples:
"http://world.news.yahoo.com/news/olympics/" -> ["world.news.yahoo.com", "yahoo.com"]
"https://www.yahoo.co.uk/#finance" -> ["www.yahoo.co.uk", "co.uk"]
"https://google.com/" -> ["google.com", "google.com"]
"https://google.com/search?query=groceries" -> ["google.com", "google.com"]

Expected output for the file: ["world.news.yahoo.com", "yahoo.com"]
*/
    public static void main(String [] args) {
        String s1 = "https://google.com/";
        String[] domain = s1.split("//")[1].split("/")[0].split("\\.");
        String subDomain =domain[domain.length-2]+"."+domain[domain.length-1];
        System.out.println(s1.split("//")[1].split("/")[0]);
        System.out.println(subDomain);
        System.out.println(domain.length);

    }


}
