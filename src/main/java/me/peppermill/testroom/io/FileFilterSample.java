package me.peppermill.testroom.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterSample {

    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String path = "/Users/hoyeonjang/Library/Mobile Documents/com~apple~CloudDocs/books";
        sample.checkList(path);
    }

    private void checkList(String path) {
        File file;
        try {
           file = new File(path);
           File[] mainFileList = file.listFiles();
           mainFileList = file.listFiles(new PDFnameFilter());
           for (File temp : mainFileList) {
               System.out.println(temp.getName());
           }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class PDFnameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        if(name.endsWith(".pdf"))
            return true;
        return false;
    }
}
