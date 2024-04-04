package uvg;

public class Patient implements Comparable<Patient> {
    private String name;
    private String diagnosis;
    private String priority;

    public Patient(String name, String diagnosis, String priorty){
        this.name = name;
        this.diagnosis = diagnosis;
        this.priority = priorty;
        String priority = " *([^,]*), *([^,]*), *([^,]*)\\|";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDiagnosis(String diagnosis){
        this.diagnosis = diagnosis;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

    public String getName(){
        return this.name;
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }

    public String getPriority(){
        return this.priority;
    }

    public int compareTo(Patient other){
        return priority.compareTo(other.getPriority());
    }

    public String toString(){
        return name + ", " + diagnosis + ", " + priority;
    } 

    public boolean equals(Patient other){
        return this.name.equals(other.getName()) && this.diagnosis.equals(other.getDiagnosis()) && this.priority.equals(other.getPriority());
    }
}
