package com.pamela.user_management_api.controller;

import com.pamela.user_management_api.model.Notification;
import com.pamela.user_management_api.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    public final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @GetMapping
    public List<Notification> getNotifications(){
        return notificationService.getNotifications();
    }
    @PostMapping
    public Notification createNotification(@RequestBody Notification notification){
        return notificationService.createNotification(notification);
    }
}
