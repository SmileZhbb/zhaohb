package yunsuan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class WriteToFile {

	public WriteToFile(String path,ArrayList<String> datasourse)
	{
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("201571030142");   //–¥»Î—ß∫≈
            bw.newLine();
            for(String data:datasourse){
                bw.write(data);  
                bw.newLine();
            }
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}
}
