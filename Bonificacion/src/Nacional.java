class Nacional {
    private String nombre;
    private int codigo;
    String registroDIAN;

    public Nacional(String nombre, int codigo, String registroDIAN) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.registroDIAN = registroDIAN;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
}