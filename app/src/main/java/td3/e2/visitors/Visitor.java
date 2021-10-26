package td3.e2.visitors;

import td3.e2.commandes.Client;
import td3.e2.commandes.Commande;
import td3.e2.commandes.GroupeClient;
import td3.e2.commandes.Ligne;

public interface Visitor {

    public void visit(GroupeClient groupeClient);
    public void visit(Client client);
    public void visit(Commande commande);
    public void visit(Ligne ligne);
}
