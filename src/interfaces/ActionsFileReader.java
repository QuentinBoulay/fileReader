package interfaces;

import java.io.IOException;

public interface ActionsFileReader {

    void openFile() throws IOException;
    void closeFile() throws IOException;
}
