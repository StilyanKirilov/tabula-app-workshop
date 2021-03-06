package bg.softuni.tabula.announcement;

import bg.softuni.tabula.announcement.service.AnnouncementService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AnnouncementCleanupScheduler {

    private final AnnouncementService announcementService;

    //cleans up old announcements.
    @Scheduled(cron = "${tabula.clean-up}")
    public void cleanupOldAnnouncements(){
        announcementService.cleanupOldAnnouncements();
    }

}
