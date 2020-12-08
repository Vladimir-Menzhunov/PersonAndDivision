import Settings.Settings;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class ReadDataOpenCSVTest {
    @Test
    public void testGetPersonLinkedList() throws IOException {


        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        }

        ReadDataOpenCSV readDataOpenCSV = new ReadDataOpenCSV(settings.getValue("foreign_names.path"));
        assertEquals(25898, readDataOpenCSV.getPersonLinkedList().size());
        assertEquals(28281, readDataOpenCSV.getPersonLinkedList().getFirst().getId());
        assertEquals(54178, readDataOpenCSV.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV.getPersonLinkedList().get(4).getOutfit().getId(),
                readDataOpenCSV.getPersonLinkedList().getLast().getOutfit().getId()
        );

        ReadDataOpenCSV readDataOpenCSV1 = new ReadDataOpenCSV(settings.getValue("foreign_namesTest1.path"));
        assertEquals(3, readDataOpenCSV1.getPersonLinkedList().size());
        assertEquals(28281, readDataOpenCSV1.getPersonLinkedList().getFirst().getId());
        assertEquals(28283, readDataOpenCSV1.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV1.getPersonLinkedList().getFirst().getOutfit().getId(),
                readDataOpenCSV1.getPersonLinkedList().getLast().getOutfit().getId()
        );
        ReadDataOpenCSV readDataOpenCSV2 = new ReadDataOpenCSV(settings.getValue("foreign_namesTest2.path"));
        assertEquals(7, readDataOpenCSV2.getPersonLinkedList().size());
        assertEquals(28296, readDataOpenCSV2.getPersonLinkedList().getFirst().getId());
        assertEquals(28302, readDataOpenCSV2.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV2.getPersonLinkedList().getFirst().getOutfit().getId(),
                readDataOpenCSV2.getPersonLinkedList().getLast().getOutfit().getId()
        );
        ReadDataOpenCSV readDataOpenCSV3 = new ReadDataOpenCSV(settings.getValue("foreign_namesTest3.path"));
        assertEquals(6, readDataOpenCSV3.getPersonLinkedList().size());
        assertEquals(42046, readDataOpenCSV3.getPersonLinkedList().getFirst().getId());
        assertEquals(42051, readDataOpenCSV3.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV3.getPersonLinkedList().getFirst().getOutfit().getId(),
                readDataOpenCSV3.getPersonLinkedList().getLast().getOutfit().getId()
        );
        ReadDataOpenCSV readDataOpenCSV4 = new ReadDataOpenCSV(settings.getValue("foreign_namesTest4.path"));
        assertEquals(6, readDataOpenCSV4.getPersonLinkedList().size());
        assertEquals(54173, readDataOpenCSV4.getPersonLinkedList().getFirst().getId());
        assertEquals(54178, readDataOpenCSV4.getPersonLinkedList().getLast().getId());
        assertEquals(
                readDataOpenCSV4.getPersonLinkedList().getFirst().getOutfit().getId(),
                readDataOpenCSV4.getPersonLinkedList().getLast().getOutfit().getId()
        );
    }

}