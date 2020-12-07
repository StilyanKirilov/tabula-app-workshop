package bg.softuni.tabula.announcement.service;

import bg.softuni.tabula.announcement.model.AnnouncementDTO;

import java.util.List;

public interface AnnouncementService {

    List<AnnouncementDTO> findAll();

    void cleanupOldAnnouncements();
}
