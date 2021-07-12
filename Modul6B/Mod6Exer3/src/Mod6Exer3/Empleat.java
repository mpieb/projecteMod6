package Mod6Exer3;

//Declaració de clase empleat
public class Empleat{
    //Declaració de variables de classe
    protected String name;
    protected String adress;
    protected String phone;
    protected double souBrutMensual;
    private double souNetMensual;
    private double souBrutAnual;
    private double souNetAnual;
    private double bonus;
    
    //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double souBrutMensual){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.souBrutMensual = souBrutMensual;
        this.souNetMensual = souNetMensual;
        this.souBrutAnual = souBrutAnual;
        this.souNetAnual = souNetAnual;
        this.bonus = bonus;
    }
    
    //Declaració setters i getters
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return  name;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return  phone;
    }
    
    public void setSouBrutMensual(double souBrutMensual){
        this.souBrutMensual = souBrutMensual;
    }
    
    public double getSouBrutMensual(){
        return souBrutMensual;
    }
    
    
    //Mètodes setter de validació
    public void setValidarBoss(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual > 8000){
            souNetMensual = souBrutMensual * 1.5;
        } else {
            throw new ArithmeticException("El sou del Boss té que ser major " +
                    "de 8000 euros!");
        }
    }
    
    public void setValidarManager(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 3000 && souBrutMensual < 5000){
            souNetMensual = souBrutMensual * 1.1;
        } else {
            throw new ArithmeticException("El sou d´un Manager oscil.la " +
                    "entre 3000 i 4999 euros!");
        }
    }
    
    public void setValidarVolunteer(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual == 0){
            souNetMensual = souBrutMensual;
        } else {
            throw new ArithmeticException("El Volunter no cobra!");
        }
    }
    
    public void setValidarSenior(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 2700 && souBrutMensual < 4000){
            souNetMensual = souBrutMensual * 0.85;
        } else {
            throw new ArithmeticException("El sou d´un Senior oscil.la " +
                    "entre 2700 i 3999 euros!");
        }
    }
    
    public void setValidarMind(double souBrutMensual) throws ArithmeticException{ 
        if(souBrutMensual >= 1800 && souBrutMensual < 2500){
            souNetMensual = souBrutMensual * 0.9;
        } else {
            throw new ArithmeticException("El sou d´un Mind oscil.la " +
                    "entre 1800 i 2499 euros!");
        }
    }
    
    public void setValidarJunior(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 900 && souBrutMensual < 1599){
            souNetMensual = souBrutMensual * 0.95;
        } else {
            throw new ArithmeticException("El sou d´un Junior oscil.la " + 
                    "entre 900 i 1599 euros!");
        }
    }
    
    public double setSouNetMensual(){
        return souNetMensual;
    }
    
    //Mètodes setters i getters per càlcul sous
    public void setSouBrutAnual (double souBrutMensual){
        this.souBrutAnual = souBrutMensual * 12;
    }
    
    public double getSouBrutAnual(){
        return souBrutAnual;
    }
    
    public void setSouNetAnualBoss(double souBrutMensual){
        this.souNetAnual = (souBrutMensual * 0.68) * 12;
    }
    
    public void setSouNetAnualManager(double souBrutMensual){
        this.souNetAnual = (souBrutMensual * 0.74) * 12;
    }
   
    public void setSouNetAnualVolunteer(double souBrutMensual){
        this.souNetAnual = souBrutMensual * 12;
    }
    
    public void setSouNetAnualSenior(double souBrutMensual){
        this.souNetAnual = (souBrutMensual * 0.76) * 12;
    }
    
    public void setSouNetAnualMind(double souBrutMensual){
        this.souNetAnual = (souBrutMensual * 0.85) * 12;
    }
    
    public void setSouNetAnualJunior(double souBrutMensual){
        this.souNetAnual = (souBrutMensual * 0.98) * 12;
    }
    
    public double getSouNetAnual(){
        return souNetAnual;
    }
    
    public void setBonus(double souBrutMensual){
        if(souBrutMensual > 300){
        bonus = (souBrutMensual * 0.1) * 12;
    }else{
            bonus = 0.0;
        }
    }
    
    public double getBonus(){
        return bonus;
    }
    
    //Mètode getter per llistar les dades del empleat per consola
    @Override
    public String toString(){
        return "name=" + name + ", adress=" + adress + ", phone=" + phone +
                ", souBrutMensual=" + souBrutMensual + ", souNetMensual=" +
                souNetMensual + ", souBrutAnual=" + souBrutAnual +
                "; souNetAnual=" + souNetAnual + ", bonus=" + bonus;
    }
    
}
    



    
