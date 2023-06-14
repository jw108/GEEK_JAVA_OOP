package model;

public abstract class User {
    protected String name;
    protected Integer BornDate;
    
    public User(String name, Integer bornDate) {
        this.name = name;
        BornDate = bornDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornDate() {
        return BornDate;
    }

    public void setBornDate(Integer bornDate) {
        BornDate = bornDate;
    }

    @Override
    public String toString() {
        return "User [Имя = " + name + ", Дата рождения = " + BornDate + "]";
    }

    
    

}
