package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public boolean checkLogin(String studentCode, String password) {
        // Tìm sinh viên trong database bằng mã số
        Optional<Student> student = studentRepository.findByStudentCode(studentCode);

        // Kiểm tra nếu sinh viên tồn tại và mật khẩu trùng khớp
        return student.isPresent() && student.get().getPassword().equals(password);
    }
}