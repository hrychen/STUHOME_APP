package com.stuhome.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stuhome.app.model.Booking;

public interface BookingDao extends JpaRepository<Booking, Long>{
}
