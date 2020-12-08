/**
 * Сущьность - человек
 */

public class Person {

    private Integer id;
    private String name;
    private String gender;
    private String birtDate;
    private Division outfit;
    private Integer salary;

    public Person(String [] listPerson) {
        this.id = Integer.parseInt(listPerson[0]);
        this.name = listPerson[1];
        this.gender = listPerson[2];
        this.birtDate = listPerson[3];
        this.outfit = new Division(listPerson[4]);
        this.salary = Integer.parseInt(listPerson[5]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public Division getOutfit() {
        return outfit;
    }

    public void setOutfit(Division outfit) {
        this.outfit = outfit;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birtDate='" + birtDate + '\'' +
                ", outfitName=" + '\'' + outfit.getName() + "' outfitName=" + outfit.getId() +
                ", salary=" + salary +
                ')' + '\n';
    }
}
