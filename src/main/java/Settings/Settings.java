package Settings;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Создаёт Properties, как ключ-значение из файла app.properties
 */
public class Settings {
    private final Properties prs = new Properties();

    /**
     * Загружаем список свойст из потока io
     * @param io - поток со свойствами
     */
    public void load(InputStream io) {
        try{
            this.prs.load(io);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return this.prs.getProperty(key);
    }
}
