-- Insert Roles
INSERT INTO roles (id, name) VALUES
(1, 'ADMIN'),
(2, 'INSTRUCTOR'),
(3, 'STUDENT');

-- Insert Users (Generic Users)
INSERT INTO users (id, first_name, last_name, email, phone, password, role_id, active)
VALUES
(1, 'Admin', 'User', 'admin@rollerspeed.com', '1234567890', 'adminpass', 1, true),
(2, 'Instructor1', 'Smith', 'instructor1@rollerspeed.com', '1234567891', 'pass123', 2, true),
(3, 'Instructor2', 'Johnson', 'instructor2@rollerspeed.com', '1234567892', 'pass123', 2, true),
(4, 'Instructor3', 'Brown', 'instructor3@rollerspeed.com', '1234567893', 'pass123', 2,  true),
(5, 'Student1', 'Taylor', 'student1@rollerspeed.com', '1234567894', 'pass123', 3,   true),
(6, 'Student2', 'Anderson', 'student2@rollerspeed.com', '1234567895', 'pass123', 3,  true),
(7, 'Student3', 'Thomas', 'student3@rollerspeed.com', '1234567896', 'pass123', 3,  true),
(8, 'Student4', 'Jackson', 'student4@rollerspeed.com', '1234567897', 'pass123', 3,  true),
(9, 'Student5', 'White', 'student5@rollerspeed.com', '1234567898', 'pass123', 3,  true),
(10, 'Student6', 'Harris', 'student6@rollerspeed.com', '1234567899', 'pass123', 3,  true);



-- Insert Students (Extended Data)
INSERT INTO users (id, birth_date, gender, active) VALUES
(5, '2010-05-15', 'Male', true),
(6, '2012-08-21', 'Female', true),
(7, '2011-03-30', 'Male', true),
(8, '2013-07-12', 'Female', true),
(9, '2014-01-25', 'Male', true),
(10, '2010-11-05', 'Female', true);

-- Insert Classes
INSERT INTO classes (id, name, scheduleDate, instructor_id) VALUES
(1, 'Beginner Skating', '2025-04-01 10:00:00', 2),
(2, 'Intermediate Skating', '2025-04-02 11:00:00', 3),
(3, 'Advanced Skating', '2025-04-03 12:00:00', 4),
(4, 'Speed Training', '2025-04-04 13:00:00', 2),
(5, 'Balance & Control', '2025-04-05 14:00:00', 3);

-- Insert Class-Student Relationships
INSERT INTO class_students (class_id, student_id) VALUES
(1, 5), (1, 6), (1, 7),
(2, 6), (2, 8),
(3, 7), (3, 9),
(4, 8), (4, 10),
(5, 9), (5, 10);

-- Insert Payments
INSERT INTO payments (id, paymentDate, paymentMethod, amount, student_id) VALUES
(1, '2025-03-20', 'Credit Card', 50.00, 5),
(2, '2025-03-21', 'Bank Transfer', 60.00, 6),
(3, '2025-03-22', 'PayPal', 70.00, 7);

-- Insert Attendance
INSERT INTO attendances (id, attendanceDate, class_id, student_id, present) VALUES
(1, '2025-04-01', 1, 5, true),
(2, '2025-04-02', 2, 6, true),
(3, '2025-04-03', 3, 7, false),
(4, '2025-04-04', 4, 8, true),
(5, '2025-04-05', 5, 9, true);
