package mydesignpatterns.comportamentali.chainOfResponsibility;

public abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    public void handleNext(Request request) {
        if(next != null)
            next.handle(request);
    }
}
