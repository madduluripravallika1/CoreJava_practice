package FileUploadtoaServer;

import java.io.File;
import java.io.FileFilter;

public class FileUploadtoaServer {
    private static final long MAX_FILE_SIZE=5*1024*1024;
    public  void uploadFile(String filePath){
        System.out.println(MAX_FILE_SIZE);
        System.out.println(filePath);
        File file=new File(filePath);
        try{
            if(file.length()>MAX_FILE_SIZE){
                throw  new IllegalAccessException(" FILE SIZE IS BIG");
            }else{
                System.out.println("Uploading file: " + file.getName());
                System.out.println("File uploaded successfully.");
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
FileUploadtoaServer fileUploadtoaServer=new FileUploadtoaServer();
fileUploadtoaServer.uploadFile("path/to/your/file.txt");
    }
}


//"Question: A user uploads a file to a server, but if the file exceeds the maximum allowed size, an error should be raised.
//
//        Clue:
//
//Use try to handle the upload process.
//throw an exception if the file size is too large.
//Use catch to handle the exception and info"