package uk.co.andymccall.people.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "ppl_title")
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "titleId", columnDefinition = "serial")
    private int titleId;

    @Column(name = "title", length = 13)
    private String title;

    public Title() {

    }

    public Title(int titleId, String title) {
        setTitleId(titleId);
        setTitle(title);
    }

    @JsonIgnore
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title{" +
                "titleId=" + titleId +
                ", title='" + title + '\'' +
                '}';
    }
}
