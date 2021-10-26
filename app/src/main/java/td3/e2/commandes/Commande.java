package td3.e2.commandes;

import td3.e2.visitable.PrePostVisitable;
import td3.e2.visitable.Visitable;
import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

public class Commande implements PrePostVisitable, Visitable {

    private String name;

    public Commande(String name) {
        this.name = name;
    }

    public void addLigne(Ligne ligne){

    }


    @Override
    public void accept(PrePostVisitor prePostVisitor) {

    }

    @Override
    public void accept(Visitor visitor) {

    }

    public String getName() {
        return name;
    }
}
