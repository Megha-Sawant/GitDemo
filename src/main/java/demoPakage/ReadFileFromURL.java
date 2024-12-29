package demoPakage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadFileFromURL
{
    public static void main(String [] args) throws IOException
    {
        String farr[];
        String line;
        String fileURL = "https://people.sc.fsu.edu/~jburkardt/data/csv/hw_200.csv";
        URL url = new URL(fileURL);
        HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
      line=  br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=  br.readLine();

        }


    }
}
