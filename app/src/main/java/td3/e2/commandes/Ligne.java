package td3.e2.commandes;

import td3.e2.visitable.PrePostVisitable;
import td3.e2.visitable.Visitable;
import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

public class Ligne implements PrePostVisitable, Visitable {

    private String name;
    private int sum;

    public Ligne(String name) {
        this.name = name;
    }

    public Ligne(String name, int sum) {
        this.name = name;
        this.sum = sum;
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

    public int getSum() {
        return sum;
    }
}
