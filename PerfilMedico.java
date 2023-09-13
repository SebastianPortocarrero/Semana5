public class PerfilMedico {
    public String nombre;
    public String apellido;
    public String sexo;
    public int diaN;
    public int mesN;
    public int anioN;
    public double altura;
    public double peso;
    
    public PerfilMedico(String nom, String ape, String sex, int dia, int mes, int anio, double alt, double pes){
        nombre = nom;
        apellido = ape;
        sexo = sex;
        diaN = dia;
        mesN = mes;
        anioN = anio;
        altura = alt;
        peso = pes;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaN() {
        return diaN;
    }

    public void setDiaN(int diaN) {
        this.diaN = diaN;
    }

    public int getMesN() {
        return mesN;
    }

    public void setMesN(int mesN) {
        this.mesN = mesN;
    }

    public int getAnioN() {
        return anioN;
    }

    public void setAnioN(int anioN) {
        this.anioN = anioN;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int getEdad(){
        int edad = 2023 - anioN - 1;
        if(mesN < 9){
            edad += 1;
        }else if(mesN == 9 && diaN < 12){
            edad += 1;
        }
        
        return edad;
    }
    
    public int getFrecuenciaCardiaca(){
        int edad = getEdad();
        return 220 - edad;
    }
    
    public double getIMC(){
        return peso / (altura*altura);
    }
}