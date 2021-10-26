package td3.e2.visitable;

import td3.e2.visitors.PrePostVisitor;
import td3.e2.visitors.Visitor;

public interface PrePostVisitable {
    public void accept(PrePostVisitor prePostVisitor);
}
