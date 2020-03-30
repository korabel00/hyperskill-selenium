package Hyperskill.patterns_constructors_overload_methods;

import java.util.Arrays;

class Employee {
    // fields
    private String name;
    private String email;
    private int experience;
    // constructor
    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    // getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {
    // write fields
    private String mainLanguage;
    private String[] skills;
    // write constructor
    public Developer(String name, String email, int experience, String mainLanguage, String[] skills){
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = Arrays.copyOf(skills, skills.length);
    }
    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }
    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {
    // write fields
    private boolean phd;
    private String[] methods;
    // write constructor
    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = Arrays.copyOf(methods,methods.length);
    }
    // write getters
    public boolean isPhD() {
        return phd;
    }
    public String[] getMethods() {
        return methods;
    }

    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
      //  System.out.println(developer);

        String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
        //System.out.println(Arrays.toString(analyst.getMethods()));
        System.out.println(analyst.isPhD());
    }

}