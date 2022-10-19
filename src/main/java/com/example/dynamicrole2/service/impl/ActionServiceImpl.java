package com.example.dynamicrole2.service.impl;

import com.example.dynamicrole2.model.Action;
import com.example.dynamicrole2.repository.ActionRepository;
import com.example.dynamicrole2.service.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {
    private final ActionRepository actionRepository;

    @Override
    public Optional<Action> findActionByUrl(String url) {
        return actionRepository.findByUrlApi(url);
    }
}
