package mhtowel.service;

import mhtowel.dto.Towel;

import java.util.List;

public interface TowelService {
    List<Towel> getListService();
    Towel getTowel();
}
