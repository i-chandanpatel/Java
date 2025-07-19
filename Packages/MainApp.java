import outerpackage.OuterClass;
import outerpackage.innerpackage.InnerClass;

public class MainApp {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.showMessage();

        InnerClass inner = new InnerClass();
        inner.showMessage();
    }
}
