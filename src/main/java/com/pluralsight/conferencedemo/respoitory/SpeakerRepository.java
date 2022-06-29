package com.pluralsight.conferencedemo.respoitory;

import com.pluralsight.conferencedemo.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
