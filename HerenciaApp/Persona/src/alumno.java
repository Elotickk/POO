public class alumno extends persona {
    private String Carrera;
    private int Curso;

        public alumno(String Apellido,String Nombre,String Domicilio, String Carrera ,int Curso){
        super(Apellido,Nombre,Domicilio);
        this.Carrera = Carrera;
        this.Curso = Curso;
        }
        // métodos ‘get’ de la subclase Deportivo
        public String getCarrera() {
            return this. Carrera;
        }
        public int getCurso() {
            return this. Curso;
        }

        public String getAtributos() {
            return super.getAtributos() +
        " Carrera : " + this.Carrera +
        " Curso : " + this.Curso;
        }
}
