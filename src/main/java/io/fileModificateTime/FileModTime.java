package io.fileModificateTime;

import java.io.File;
import java.util.Date;

public class FileModTime {
    File file;

    public FileModTime(File file) {
        this.file = file;
    }

    public long whenModification() {
        return file.lastModified ( );
    }

    public Date showDate(){
        return new Date ( whenModification() );
    }
}
