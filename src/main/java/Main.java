import java.io.*;
import java.util.List;
import Settings.Settings;
import com.opencsv.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReadDataOpenCSV readDataOpenCSV = new ReadDataOpenCSV(settings.getValue("foreign_names.path"));
        System.out.println(readDataOpenCSV.getPersonLinkedList().toString());

    }
}
