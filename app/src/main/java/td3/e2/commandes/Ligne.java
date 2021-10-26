package td3.e2.commandes;

import td3.e2.visitable.PrePostVisitable;
import td3.e2.visitable.Visitable;
import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String string;
    private int entier;

    public Ligne(String string) {
        this.string = string;
    }

    public Ligne(String string, int entier) {
        this.string = string;
        this.entier = entier;
    }


    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }
}
