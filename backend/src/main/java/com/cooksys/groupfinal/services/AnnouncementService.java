package com.cooksys.groupfinal.services;

import java.util.Set;

import com.cooksys.groupfinal.dtos.AnnouncementDto;

public interface AnnouncementService {

    Set<AnnouncementDto> findAllUserAnnouncements(Long id);

    Set<AnnouncementDto> findAllAnnouncements();
}
