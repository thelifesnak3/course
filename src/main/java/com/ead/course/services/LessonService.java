package com.ead.course.services;

import com.ead.course.models.LessonModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LessonService {
    LessonModel save(LessonModel lessonModel);
    Optional<LessonModel> findLessonIntoModule(UUID lessonId, UUID moduleId);
    void delete(LessonModel lessonModel);
    List<LessonModel> findAll(UUID moduleId);
}
