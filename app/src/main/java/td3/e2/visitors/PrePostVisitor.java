package td3.e2.visitors;

import td3.e2.commandes.Client;
import td3.e2.commandes.Commande;
import td3.e2.commandes.GroupeClient;
import td3.e2.commandes.Ligne;

public interface PrePostVisitor {

    public void preVisist(GroupeClient groupeClient);
    public void preVisist(Client client);
    public void preVisist(Commande commande);
    public void preVisist(Ligne ligne);
    public void postVisist(GroupeClient groupeClient);
    public void postVisist(Client client);
    public void postVisist(Commande commande);
    public void postVisist(Ligne ligne);

}
