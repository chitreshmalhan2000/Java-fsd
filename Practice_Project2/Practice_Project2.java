package Practice_Project2;
public class Practice_Project2 {
    public static void main(String[] args) {
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        defaultAccessModifier.display();

        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        publicAccessModifier.display();

        PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier();
         // privateAccessModifier.display();
        // Won't compile because the method is private and cannot be accessed from outside the class
        
        ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
        protectedAccessModifier.display();
    }
}
class DefaultAccessModifier {
    void display() {
        System.out.println("This is a default access modifier.");
    }
}

class PublicAccessModifier {
    public void display() {
        System.out.println("This is a public access modifier.");
    }
}


class PrivateAccessModifier {
    private void display() {
        System.out.println("This is a private access modifier.");
    }
}

class ProtectedAccessModifier {
    protected void display() {
        System.out.println("This is a protected access modifier.");
    }
}
