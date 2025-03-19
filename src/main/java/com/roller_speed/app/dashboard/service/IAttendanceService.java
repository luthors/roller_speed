package com.roller_speed.app.dashboard.service;

import java.util.List;
import java.util.Optional;

import com.roller_speed.app.dashboard.model.entity.Attendance;

public interface IAttendanceService {
    List<Attendance> getAllAttendances();
    Optional<Attendance> getAttendanceById(Long id);
    List<Attendance> getAttendancesByStudentId(Long studentId);
    List<Attendance> getAttendancesByClassId(Long classId);
    Attendance saveAttendance(Attendance attendance);
    void deleteAttendance(Long id);
}