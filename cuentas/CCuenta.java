package cuentas;

/**
 * @author Antonio Piñero Sánchez
 */
public class CCuenta {
	
	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Parámetros
     * @param nom hace referencia al nombre del propietario
     * @param cue hace referencia a la cuenta
     * @param sal hace referencia al saldo de la cuenta
     * @param tipo hace referencia al tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método para obtener el estado actual de la cuenta (saldo)
     * @return devuelve el el estado de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que comprueba que la cantidad que se ingresa no sea negativa, en caso de serlo,
     * captura el error y lanza un mensaje.
     * @param cantidad hace referencia a la cantidad a ingresar
     * @throws Exception recoge un posible error de ingreso negativo
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que se encarga de comprobar que la cantidad a retirar no es negativa y
     * también de que no se retire más dinero del disponible en el momento.
     * @param cantidad hace referencia a la cantidad a retirar
     * @throws Exception recoge un posible error de retirar una cantidad negativa o superior al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el nombre del propietario
     * @return devuelve el nombre del propietario
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para modificar o actualizar el nombre del propietario
	 * @param nombre devuelve el nombre del propietario
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener la cuenta
	 * @return devuelve el valor de la variable cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para actualizar la cuenta
	 * @param cuenta devuelve el valor de la variable cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método para obtener el saldo de la cuenta
	 * @return devuelve el saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método para actualizar el saldo de la cuenta
	 * @param saldo devuelve el saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para obtener el tipo de interés
	 * @return devuelve el tipo de interés
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método para actualizar o modificar el tipo de interés	
	 * @param tipoInteres devuelve el tipo de interés
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
