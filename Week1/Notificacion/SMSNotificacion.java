public class SMSNotificacion extends Notificacion implements Envia {

    public SMSNotificacion(String mensaje, String destinatario) {
        super(mensaje, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al número " + destinatario +
                           " [Costo: $0.10]");
    }
}
