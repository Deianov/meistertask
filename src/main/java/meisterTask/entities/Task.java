package meisterTask.entities;

import javax.persistence.*;

// represent class Task as database Table
@Entity
// set database table name -> "tasks"
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", columnDefinition = "text", nullable = false)
    private String title;

    @Column(nullable = false)
    private String status;

    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    public Task() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
