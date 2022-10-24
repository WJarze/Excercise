package copyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


class CopyTest {
    // given
    String ORGINAL_PATH_NAME = "SingList.txt";
    String PATH_NAME = "SingListCopy.txt";
    Copy copy = new Copy ( );

    @Test
    public void givenNIO2_whenCopied_thenCopyExistsWithSameContents()
            throws IOException {
        //when
        copy.CopyFile ( ORGINAL_PATH_NAME , PATH_NAME );
        //then
        Assertions.assertEquals ( Files.readAllLines ( Path.of ( ((PATH_NAME)) ) ) , (Files.readAllLines ( Path.of ( ((ORGINAL_PATH_NAME)) ) )) );
    }


}