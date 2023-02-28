package org.example.service;

import org.example.dto.MyPair;

import java.util.List;

public interface WhoisService {
    MyPair whois(String domainName);

    List<MyPair> analyze(String text);
}