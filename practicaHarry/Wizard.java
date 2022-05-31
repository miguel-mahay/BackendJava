package practicaHarry;

public class Wizard {
    private String name;
    private String lastname;
    private String gender;
    private String house;
    private String boggart;
    private String patronus;



    public Wizard (String name, String lastname, String gender, String house, String boggart, String patronus) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }



    public String getName(){  return name;  }
    public String getLastname(){  return lastname;  }
    public String getGender(){  return gender;  }
    public String getHouse(){  return house;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){ return patronus;  }



    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setLastname(String lastname){
        if(!lastname.isEmpty()){
            this.lastname = lastname;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }



    public void showInformation() {
        System.out.print("Name: "+name+
                "\nLastname: "+lastname+
                "\nGender: "+gender+
                "\nHouse: "+house+
                "\nBoggart: "+boggart+
                "\nPatronus: "+patronus+"\n\n");
    }

}
