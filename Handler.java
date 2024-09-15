package oop.patterns.chainofresponsibility;

public interface Handler {
    void setNextHandler(Handler handler);
    void process(String filePath);
    String getHandlerName();
}
