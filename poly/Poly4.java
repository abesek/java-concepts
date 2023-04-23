public class Poly4 {
    public static void main(String[] args) {
        interfaceX Third = new Third();
        interfaceX Fifth = new Fifth(); // no error
        //interfaceX First = new First(); // compiler error
        First Sixth = new Sixth();
    }
}
interface interfaceX {}

class First {}
class Second extends First {}
class Third extends Second implements interfaceX {}
class Fourth extends First {}
class Fifth extends Third {}
class Sixth extends Fifth {}

