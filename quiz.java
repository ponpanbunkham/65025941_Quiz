public class quiz {
    public static void main(String[] args) {
        student s1 = new student();
        s1.SetStudentID("Admin",65025941);
        s1.SetName("Admin","Ponpan");
        s1.SetAdd("Admin",2565);
        s1.SetGpa("Admin",2.87);
    }
    
}
class student {
    public int ID;
    public String name;
    public int addyear;
    public double gpa;

    
    public void SetStudentID(String Mode,int NewID){
        if (Mode == "Admin"){
            this.ID = NewID;
            System.out.println("ID : "+ NewID);
        }else{
            System.out.println("Not");
        }

    }
    public int SetStudentID(){
        return this.ID;
        

    }
    public void SetName(String Mode, String NewName){
        if (Mode == "Admin"){
            this.name = NewName;
            System.out.println("Name : "+ NewName);
        }else{
            System.out.println("Not");
        }

    }
    public String GetName(){
        return this.name;
    }

    public void SetAdd(String Mode,int NewAddy){
        if (Mode == "Admin"){
            this.addyear = NewAddy;
            System.out.println("Addmission Year : "+ NewAddy);
        }else{
            System.out.println("Not");
        }
    }
    public int SetAdd(){
        return this.addyear;
    }

    public void SetGpa(String Mode,Double NewGpa){
        if (Mode == "Admin"){
            this.gpa = NewGpa;
            System.out.println("GPA : "+ NewGpa);
        }else{
            System.out.println("Not");
        }
    }
    public double SetGpa(){
        return this.gpa;
    }
} 
