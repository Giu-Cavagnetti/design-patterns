package mydesignpatterns.comportamentali.chainOfResponsibility;

public class ConcreteHandlers extends BaseHandler{

    @Override
    public void handle(Request request){
        if(canHandle(request)){

            ///La gestisce
        }
           else{
            handleNext(request);
        }

    }

    private boolean canHandle(Request request){
        return true;
        ///
    }
}
