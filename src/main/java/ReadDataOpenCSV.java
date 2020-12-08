import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.*;


/**
 * Класс обработки CSV файла.
 */
public class ReadDataOpenCSV {
    private final LinkedList<Person> personLinkedList = new LinkedList<Person>();

    /**
     * Обрабатываем csv файл с помощью библиотеки opencsv, результат записываем в LinkedList
     * @param pathFile - путь полученный из потока к файлу.
     */
    ReadDataOpenCSV(String pathFile) {
        try {

            FileReader fileReader = new FileReader(pathFile);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(fileReader).withCSVParser(parser).withSkipLines(1).build();

            List<String []> listCSV = csvReader.readAll();

            for(String [] listPerson : listCSV) {
                personLinkedList.add(new Person(listPerson));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public LinkedList<Person> getPersonLinkedList() {
        return personLinkedList;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Person person : personLinkedList) {
            str.append(person.toString());
        }
        return str.toString();
    }
}
