package com.ead.course.services.impl;

import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.LessonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;
}
