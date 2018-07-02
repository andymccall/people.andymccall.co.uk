package uk.co.andymccall.people.model;

import javax.persistence.*;

@Entity
@Table(name = "ppl_town")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "townId", columnDefinition = "serial")
    private int townId;

    @Column(name = "townName")
    private String townName;

    public Town() {

    }

    public Town(int townId, String townName) {
        this.townId = townId;
        this.townName = townName;
    }

    public int getTownId() {
        return townId;
    }

    public void setTownId(int townId) {
        this.townId = townId;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    @Override
    public String toString() {
        return "Town{" +
                "townId=" + townId +
                ", townName='" + townName + '\'' +
                '}';
    }
}
