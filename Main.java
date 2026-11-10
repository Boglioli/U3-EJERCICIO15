public class Main {
    public static void main (String[] args) {
        Enrutador router = new Enrutador("router1");
        router.setDirrecionIP("123.45.6.8");
        router.setDirrecionIP("123.456.7.8");
        router.setDirrecionIP("hola");
        System.out.println("ip: " + router.getDirrecionIP());
        System.out.println("conectado: " + router.isConectado());
    }
}
