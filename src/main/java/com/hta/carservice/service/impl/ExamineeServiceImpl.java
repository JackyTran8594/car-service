package com.hta.carservice.service.impl;

import com.hta.carservice.service.ExamineeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExamineeServiceImpl implements ExamineeService {

    private final Logger log = LoggerFactory.getLogger(ExamineeServiceImpl.class);
}
