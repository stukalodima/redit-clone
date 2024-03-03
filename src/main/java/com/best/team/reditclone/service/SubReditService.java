package com.best.team.reditclone.service;

import com.best.team.reditclone.entity.SubRedit;
import com.best.team.reditclone.repository.SubReditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubReditService {

    private final SubReditRepository subReditRepository;

    public void save(SubRedit subRedit) {
        subReditRepository.save(subRedit);
    }

    public List<SubRedit> list() {
        return subReditRepository.findAll();
    }
}
