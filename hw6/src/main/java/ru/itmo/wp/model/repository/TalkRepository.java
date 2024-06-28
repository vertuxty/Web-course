package ru.itmo.wp.model.repository;

import ru.itmo.wp.model.domain.Talk;

import java.util.List;

public interface TalkRepository {

    void send(Talk talk);


    List<Talk> findAll();
}
