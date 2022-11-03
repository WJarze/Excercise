package io.fileModificateTime;

import java.io.File;

public class FileModTime {
    File file;

    public FileModTime(File file) {
        this.file = file;
    }

    public long whenModification() {
        return file.lastModified ( );
    }
}
