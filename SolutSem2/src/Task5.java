import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static List <String> fileName (String ditPath){
        List <String> fNames = new ArrayList<>();
        File directory = new File(ditPath);
        if ( directory.isDirectory()){
            for(File item: directory.listFiles()){
                fNames.add(item.getName());
            }
        }

        return fNames;
    }

}
