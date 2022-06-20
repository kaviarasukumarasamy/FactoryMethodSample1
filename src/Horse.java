
public class Horse implements Animal{
	int age;
    
    public Horse() {
        super();
        this.age = 0;
    }
     
    @Override
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String getAge() {
        return "The HORSE has "+age+" years old.";
    }

}
