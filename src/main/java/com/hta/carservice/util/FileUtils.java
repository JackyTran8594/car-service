package com.hta.carservice.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

    public static File convertMultipartFileToFile(MultipartFile file) throws IOException {
        File newFile = new File(file.getOriginalFilename());
        FileOutputStream outputStream = new FileOutputStream(newFile);
        outputStream.write(file.getBytes());
        outputStream.close();
        return newFile;
    }
}
