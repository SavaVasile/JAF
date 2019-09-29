package package1;

public class JAF {
    private String nume;
    public int id;
    protected Integer age;
    String prenume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public JAF(String nume, int id, Integer age, String prenume) {
        this.nume = nume;
        this.id = id;
        this.age = age;
        this.prenume = prenume;
    }
}
