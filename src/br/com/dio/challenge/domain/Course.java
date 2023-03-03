package br.com.dio.challenge.domain;

public class Course extends Content {
    private int workload;

    public Course() {
    }

    @Override
    public double calculateXP() {
        return STANDARD_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
