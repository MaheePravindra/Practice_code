import java.util.*;
public class vector_eg {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.addElement("Hello");
        vc.addElement("World");
        vc.addElement("!");
        System.out.println("Elements: "+vc);
        vc.insertElementAt("Hui Hui", 1);
        System.out.println("Elements: "+vc);
        System.out.println("Size of list: "+vc.size());
        vc.removeElement("!");
        System.out.println("Elements: "+vc);
        vc.removeElementAt(1);
        System.out.println("Elements: "+vc);
        vc.removeAllElements();
        System.out.println("Elements: "+vc);
    }
}
