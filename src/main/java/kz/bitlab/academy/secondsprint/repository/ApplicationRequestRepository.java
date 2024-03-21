package kz.bitlab.academy.secondsprint.repository;

import kz.bitlab.academy.secondsprint.entity.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRequestRepository extends JpaRepository<ApplicationRequest, Long> {
    List<ApplicationRequest> findByHandledTrue();
    List<ApplicationRequest> findByHandledFalse();
}
