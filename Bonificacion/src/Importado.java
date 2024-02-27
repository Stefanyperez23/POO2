class Importado {
    private String nombre;
    private int codigo;
    String licenciaImportacion;

    public Importado(String nombre, int codigo, String licenciaImportacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.licenciaImportacion = licenciaImportacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
}