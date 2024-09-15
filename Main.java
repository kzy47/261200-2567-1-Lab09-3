package oop.patterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        String path1 = "/home/myfile.txt";  
        String path2 = "/home/myfile.zip";
        String path3 = "/home/myfile.doc";

       
        TextFileHandler textHandler = new TextFileHandler("Text Handler");
        ZipFileHandler zipHandler = new ZipFileHandler("Zip Handler");
        DocFileHandler docHandler = new DocFileHandler("Doc Handler");

        
        textHandler.setNextHandler(zipHandler);
        zipHandler.setNextHandler(docHandler);

        
        textHandler.process(path1);
        textHandler.process(path2);
        textHandler.process(path3);
    }
}
