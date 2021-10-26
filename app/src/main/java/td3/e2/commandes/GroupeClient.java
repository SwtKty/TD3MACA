package td3.e2.commandes;

import td3.e2.visitable.PrePostVisitable;
import td3.e2.visitable.Visitable;
import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

import java.util.List;

public class GroupeClient implements PrePostVisitable, Visitable {
    private String name;
    private List<Client> clients;

    public GroupeClient(String name) {
        this.name = name;
    }

    public void addClient(Client client){

    }

    public void addCommande(String string, Commande commande){

    }

    public void addLigne(String string1, String string2, Ligne ligne){

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

    public List<Client> getClients() {
        return clients;
    }
}
