package service.chainofres;


import com.entities.DersTalepBilgisi;

public abstract class DersHandler {

    protected DersHandler next;

    public DersHandler setNext(DersHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(DersTalepBilgisi talep);
    
    protected boolean nextHandle(DersTalepBilgisi talep) {
        if (next == null) return true;
        return next.handle(talep);
    }
}

