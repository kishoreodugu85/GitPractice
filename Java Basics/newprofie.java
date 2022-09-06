public class newprofie {
    public static void main(String[] args) {

        profile Employee = new profile();
        profile2 Employee2 = new profile2("Lakshimi Odugu", "Msc", "Koduru", 36);
        Employee2.fullprofile();

        Employee.setName("kishore");
        Employee.setAge(37);
        Employee.setQual("M.tech");
        Employee.setBirthPlace("Gokarnamatem");
        Employee.fullprofile();
        
    }
    
}
