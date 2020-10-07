package bg.softuni.tabula;

import bg.softuni.tabula.announcement.model.AnnouncementEntity;
import bg.softuni.tabula.announcement.repository.AnnouncementRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class TabulaApplicationInit implements CommandLineRunner {

    private final AnnouncementRepository announcementRepository;

    @Override
    public void run(String... args) throws Exception {

        if (announcementRepository.count() == 0) {
            AnnouncementEntity announcementEntity = new AnnouncementEntity();
            announcementEntity.setTitle("Hello, Everyone!");
            announcementEntity.setDescription("It's nice to see you!");
            announcementEntity.setCreatedOn(Instant.now());
            announcementEntity.setUpdatedOn(Instant.now());
            announcementRepository.save(announcementEntity);
        }
    }
}
