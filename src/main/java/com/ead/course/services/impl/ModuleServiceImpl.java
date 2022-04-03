package com.ead.course.services.impl;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModuleServiceImpl implements ModuleService {

    private final ModuleRepository moduleRepository;
}
