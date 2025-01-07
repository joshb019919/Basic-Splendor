package org.borthick.neotracker.service.impl;

import org.borthick.neotracker.dao.NeoTrackerRepository;
import org.borthick.neotracker.dao.impl.NeoTrackerRepositoryImpl;
import org.borthick.neotracker.service.NeoTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeoTrackerServiceImpl implements NeoTrackerService {
    @Autowired
    NeoTrackerRepositoryImpl neoTrackerRepository;
}
