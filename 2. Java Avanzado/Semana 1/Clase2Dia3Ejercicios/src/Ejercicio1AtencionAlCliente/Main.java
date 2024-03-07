package Ejercicio1AtencionAlCliente;

public class Main {
    public static void main(String[] args) {

        /*Ejercicio Nº 1 - Simulación de un centro de atención al cliente

• Crea una simulación de un centro de atención al cliente en la que varios agentes de soporte pueden atender llamadas telefónicas concurrentemente.
• Cada agente se representa como un hilo independiente.
• Los agentes deben recibir llamadas de clientes, resolver consultas y registrar información sobre cada llamada. Utiliza hilos para simular la atención concurrente de múltiples llamadas y garantizar que los agentes puedan manejarlas de manera eficiente.
• Asegúrate de controlar la concurrencia para evitar conflictos en la asignación de llamadas a los agentes.

        */

        AgenteDeSoporte agente1 = new AgenteDeSoporte("Agente 1");
        AgenteDeSoporte agente2 = new AgenteDeSoporte("Agente 2");

        agente1.start();
        agente2.start();
    }
}
