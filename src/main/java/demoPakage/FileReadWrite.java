package demoPakage;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadWrite
{
    public static void main(String [] args) throws IOException {
        //to get the path
        File fpath = new File("data/textfile.txt");


        //write data into file
        String s = "wish you all the best";
        FileWriter wr =new FileWriter(fpath,true);
        BufferedWriter bw =new BufferedWriter(new FileWriter(fpath));
        bw.write(s);
        bw.close();

        //read file to String
        String jsonContent = FileUtils.readFileToString(fpath, StandardCharsets.UTF_8);
        System.out.println(jsonContent);





    }
}
