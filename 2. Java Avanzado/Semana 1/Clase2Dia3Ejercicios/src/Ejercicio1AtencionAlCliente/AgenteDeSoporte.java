package Ejercicio1AtencionAlCliente;

public class AgenteDeSoporte extends Thread {
    private String nombre;
    private int llamadasAtendidas;

    public AgenteDeSoporte(String nombre) {
        this.nombre = nombre;
        this.llamadasAtendidas = 0;//se inicializa en 0
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            atenderLlamada();
        }
        System.out.println("El agente " + nombre + " ha atendido " + llamadasAtendidas + " llamadas");
    }

    private synchronized void atenderLlamada() {
        System.out.println("El agente " + nombre + " esta atendiendo una llamada.");
        llamadasAtendidas++;
        try {
            Thread.sleep(1600);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

