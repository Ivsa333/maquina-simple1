public class MaquinaExpendedoraSimple {
    
    // El precio del billete
    private int precioBillete;
    // La cantidad de dinero que lleva metida el cliente actual
    private int balanceClienteActual;
    // El total de dinero almacenado en la maquina desde su ultimo vaciado
    private int totalDineroAcumulado;
    // El origen del billete
    private String estacionOrigen;
    // El destino del billete
    private String estacionDestino;

    /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple() {
        precioBillete = 20;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "Le�n";
        estacionDestino = "Oviedo";
    }
    
     /**
     * Crea una maquina expendedora de billetes de tren con el 
     * precio del billete y el origen y destino dados. Se asume que el precio
     * del billete que se recibe es mayor que 0.
     */
    public MaquinaExpendedoraSimple(int precioDelBillete, String estacionDelDestino) {
        precioBillete = precioDelBillete;
        balanceClienteActual = 0;
        totalDineroAcumulado = 0;
        estacionOrigen = "Le�n";
        estacionDestino = estacionDelDestino;
    }
    
    /**
     * Elegir el precio del billete
     */
    public void setPrecioBillete(int nuevoPrecioBillete) {
        this.precioBillete = nuevoPrecioBillete;
    }
    
    /**
     * Devuelve el precio del billete
     */
    public int getPrecioBillete() {
        return precioBillete;
    }
    
    /**
    * 
    */
    public void VaciarDepositoDinero() {
        totalDineroAcumulado = 0;
    }
    
    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getBalanceClienteActual() {
        return balanceClienteActual;
    }
    
    /**
     * Reducir el precio del billete
     */
    public void reducirPrecioBillete(int cuantoReducirPrecioBillete) {
        precioBillete = precioBillete - cuantoReducirPrecioBillete;
    }
    
    /**
     * Simula la introduccion de dinero por parte del cliente actual
     */
    public void introducirDinero(int cantidadIntroducida) {
        balanceClienteActual = balanceClienteActual + cantidadIntroducida;
    }
   
    /**
     * Devuelve la cantidad de dinero que el cliente actual lleva introducida
     */
    public int getTotalDineroAcumulado() {
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        balanceClienteActual = 0;
        return totalDineroAcumulado;
    }
    
    
    /**
     * Imprime un billete para el cliente actual
     */
    public void imprimirBillete() {
        // Simula la impresion de un billete
        System.out.println("##################");
        System.out.println("# Billete de tren:");
        System.out.println("# De " + estacionOrigen + " a " + estacionDestino);
        System.out.println("# " + precioBillete + " euros.");
        System.out.println("##################");
        System.out.println();

        // Actualiza el total de dinero acumulado en la maquina
        totalDineroAcumulado = totalDineroAcumulado + balanceClienteActual;
        // Queda preparada para el proximo cliente
        balanceClienteActual = 0;
    }
}
