package com.ead.course.services.impl;

import com.ead.course.repositories.CourseRepository;
import com.ead.course.services.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
}
