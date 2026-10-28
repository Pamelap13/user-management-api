package com.pamela.user_management_api.service;

import com.pamela.user_management_api.model.Notification;
import com.pamela.user_management_api.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getNotifications(){
        return notificationRepository.findAll();
    }
    public Notification createNotification(Notification notification){
        return notificationRepository.save(notification);
    }
}
