package oop.patterns.chainofresponsibility;

public class DocFileHandler implements Handler {
    private Handler nextHandler;
    private String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }

    @Override
    public void process(String filePath) {
        if (filePath.contains(".doc") || filePath.contains(".docx")) {
            System.out.println(handlerName + " is processing file: " + filePath);
        } else if (nextHandler != null) {
            nextHandler.process(filePath);
        } else {
            System.out.println("File type does not supported " + filePath);
        }
    }
}