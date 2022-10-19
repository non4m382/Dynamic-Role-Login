package com.example.dynamicrole2.service;

import com.example.dynamicrole2.model.Action;

import java.util.Optional;

public interface ActionService {
    public Optional<Action> findActionByUrl(String url);
}
