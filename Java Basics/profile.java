public class profile{
    private String Name, Qualifi, BirthPlace;
    private int yourAge;

    public void setName( String name){
        Name = name;
    }
    public void setQual(String Qual){
        Qualifi = Qual;
    }
    public void setAge( int Age){
        yourAge = Age;
    }
    public void setBirthPlace( String birth){
        BirthPlace = birth;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return yourAge;
    }
    public String getQual(){
        return Qualifi;
    }
    public String getBrith(){
        return BirthPlace;
    }

    public void fullprofile(){
        System.out.printf("Name of the Employee : %s %n", getName());
        System.out.printf("Age of the Employee: %d %n" , getAge());
        System.out.printf("Qualification of the Employee : %s %n", getQual());
        System.out.printf("Birth Place of the Employee: %s %n", getBrith());
    }
}