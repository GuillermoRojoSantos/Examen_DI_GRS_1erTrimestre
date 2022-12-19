package com.examen.examenDiGrsPrimerertrimestre;

public class Persona {
    //Atributos
    public String nombre;
    public int edad;
    public double peso;
    public double altura;
    public String sexo;
    public String actividad;
    public double ger;
    public double get;

    public Persona() {
    }
    public Persona(String nombre, int edad, double peso, double altura, String sexo, String actividad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.actividad = actividad;
        this.ger = calcularGer();
        this.get = calcularGet();
    }

    public double calcularGet() {
        double result=0.0;
       if (this.sexo.equals("Hombre")){
          switch (this.actividad){
              case "Muy ligera":result=1.3;
              case "Ligera":result=1.6;
              case "Moderada":result=1.7;
              case "Intensa":result=2.1;
          }
       }else{
           switch (this.actividad){
               case "Muy ligera":result=1.3;
               case "Ligera":result=1.5;
               case "Moderada":result=1.7;
               case "Intensa":result=1.9;
           }
       }
       return result;
    }

    public double calcularGer() {
        if (this.sexo.equals("hombre")){
           return  66.473 + 13.7516 * this.peso + 5.0033 * this.altura - 6.755 * this.edad;
        }else{
            return 655.0955 + 9.5634 * this.peso + 1.8496 * this.altura - 4.6756 * this.edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public double getGer() {
        return ger;
    }

    public void setGer(double ger) {
        this.ger = ger;
    }

    public double getGet() {
        return get;
    }

    public void setGet(double get) {
        this.get = get;
    }
}
