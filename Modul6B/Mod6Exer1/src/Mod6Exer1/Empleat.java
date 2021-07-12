package Mod6Exer1;

public class Empleat{
    
    //Declaració de camps de classe
    private String name;
    private String adress;
    private String phone;
    private double salaryMonth;
    private double aument;
    
    //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double salaryMonth){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.salaryMonth = salaryMonth;
    }
        
    public void setName(String name){//Setter
        this.name = name;
    }
    
    public String getName(){//Getter
        return  name;
    }
    
    public void setAdress(String adress){//Setter
        this.adress = adress;
    }
    
    public String getAdress(){//Getter
        return adress;
    }
    
    public void setPhone(String phone){//Setter
        this.phone = phone;
    }
    
    public String getPhone(){//Getter
        return  phone;
    }
    
    public void setSalaryMonth(double salaryMonth){//Setter
        this.salaryMonth = salaryMonth;
    }
    
    public double getSalaryMonth(){//Getter
        return salaryMonth; 
    }
    
    public void setSouTotal(double percentaje){//Setter
        aument = salaryMonth*percentaje/100;
        aument = aument + salaryMonth;
    }
    
    public double getSouTotal(){//Getter
        return aument;
    }
    
    //Mètode per llistar les dades dels empleats per consola
    @Override
    public String toString(){
        return "name=" + name + ", adress=" + adress + ", phone=" + phone +
                ", SalaryPerMonth=" + salaryMonth + ", totalP=" + aument;
    }

}

    
    
    
    

