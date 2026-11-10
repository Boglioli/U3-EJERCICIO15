public class Enrutador {
    private String identificador;
    private String dirrecionIP;
    private boolean conectado;
    public Enrutador(String identificador)  {
        this.identificador = identificador;
        this.dirrecionIP = "0.0.0.0";
        this.conectado = false;
    }
    public void setDirrecionIP(String nuevaIP) {
        if (nuevaIP.matches("\\d{1,3}(\\.\\d{1,3}){3}")) {
            String[] partes = nuevaIP.split("\\.");
            boolean valida = true;
            for (int i = 0; i < 4; i++) {
                if (Integer.parseInt(partes[i]) > 255) {
                    valida = false;
                }
            }
            if (valida) {
                dirrecionIP = nuevaIP;
                System.out.println("ip configurada");
            } else {
                System.out.println("ip incorrecta");
            }
            } else {
            System.out.println("ip incorrecta");
        }
    }
    public String getDirrecionIP() {
        return dirrecionIP;
    }
    public boolean isConectado() {
        return conectado;
    }
}
