package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tourtasks")
public class TOURTASKS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourTasks")
    private int IDtourTasks;

    @Column(name="description")
    private String description;

    @Column(name = "completionTime")
    private String completionTime;

    @Column(name="taskStatus")
    private boolean taskStatus;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private TOUR tour;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "staff_id")
    private WEHEREISMYSTAFF staff;

    @ElementCollection
    private List<String> statuses;


    public TOURTASKS() {
        statuses = new ArrayList<>();
        statuses.add("ГОТОВ");
        statuses.add("НЕ ГОТОВ");
        statuses.add("ГОТОВИТСЯ");
    }

    public TOURTASKS(String description, boolean taskStatus, String completionTime) {
        this.description = description;
        this.taskStatus = taskStatus;
        this.completionTime = completionTime;
    }

    public List<String> getStatuses() {
        return statuses;
    }


    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public TOUR getTour() {
        return tour;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    public WEHEREISMYSTAFF getStaff() {
        return staff;
    }

    public void setStaff(WEHEREISMYSTAFF staff) {
        this.staff = staff;
    }

    public int getIDtourTasks() {
        return IDtourTasks;
    }

    public void setIDtourTasks(int IDtourTasks) {
        this.IDtourTasks = IDtourTasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    @Override
    public String toString() {
        return "TourTasks{" +
                "IDtourTasks=" + IDtourTasks +
                ", description='" + description + '\'' +
                ", taskStatus=" + taskStatus +
                '}';
    }


}
