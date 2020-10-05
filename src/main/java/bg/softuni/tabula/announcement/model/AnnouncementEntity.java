package bg.softuni.tabula.announcement.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Table(name = "announcements")
@Data
public class AnnouncementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private Instant createdOn;

    @Column
    @NotNull
    private Instant updatedOn;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String description;
}
