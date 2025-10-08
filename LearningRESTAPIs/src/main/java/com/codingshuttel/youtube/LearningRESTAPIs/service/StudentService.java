package com.codingshuttel.youtube.LearningRESTAPIs.service;

import com.codingshuttel.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttel.youtube.LearningRESTAPIs.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long Id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);


    void deleteStudentById(Long id);

    StudentDto updateService(Long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialService(Long id, Map<String, Object> updates);
}
