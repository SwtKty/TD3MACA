package td3.e2.commandes;

import td3.e2.visitable.PrePostVisitable;
import td3.e2.visitable.Visitable;
import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

public class Client implements PrePostVisitable, Visitable {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void addCommande(Commande commande){

    }

    public void addLigne(String string, Ligne ligne){

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
