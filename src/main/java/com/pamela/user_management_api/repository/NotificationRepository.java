package com.pamela.user_management_api.repository;

import com.pamela.user_management_api.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
