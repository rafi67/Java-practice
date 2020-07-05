package JavaMemoryManagement;

public class StaticKeyword {
    public static void main(String [] args){
        Emp Rafi = new Emp();
        Emp Shafil = new Emp();
        Rafi.id = 12;
        Rafi.salary = 50000;
        Rafi.company = "SAP";
        Rafi.ceo = "Arif";
        Shafil.id = 13;
        Shafil.salary = 30000;
        Shafil.company = "Apple";
        Rafi.showInfo();
        Shafil.showInfo();
    }
}
