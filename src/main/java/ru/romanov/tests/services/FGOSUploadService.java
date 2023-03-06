package ru.romanov.tests.services;

import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class FGOSUploadService {

    public void uploadFileByComponent(MemoryBuffer memoryBuffer) {

        File file = new File("/home/ioromanov/Диплом/graduate-work/in" + memoryBuffer.getFileName());
        try {
            FileUtils.copyInputStreamToFile(memoryBuffer.getInputStream(), file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

    public void uploadFileByLink(String link) {
        System.out.println(link);
    }
}
