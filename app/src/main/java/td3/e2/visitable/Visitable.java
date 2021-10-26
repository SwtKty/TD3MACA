package td3.e2.visitable;

import td3.e2.visitors.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
