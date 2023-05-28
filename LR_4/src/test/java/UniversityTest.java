import Controllen.*;
import Model.*;

import org.junit.Assert;
import org.junit.Test;

public class UniversityTest {
    @Test
    public void testFileWriteJsonToFile() {
        String filePath = "src/main/java/testJSON.json";
        JsonManager jsonManager = new JsonManager();
        UniversityCreator universityCreator = new UniversityCreator();

        University oldUniversity = universityCreator.createTypicalUniversity();

        jsonManager.writeToJsonFile(oldUniversity, filePath);
        University newUniversity = (University) jsonManager.readFromJsonFile(filePath);

        Assert.assertEquals(oldUniversity, newUniversity);
    }
}

