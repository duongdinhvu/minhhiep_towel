package mhtowel.service;

import mhtowel.dao.TowelMapper;
import mhtowel.dto.Towel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TowelServiceImpl implements TowelService {


    @Autowired
    private TowelMapper towelMapper;

    @Override
    public List<Towel> getListService() {
        return towelMapper.getListTowel();
    }

    @Override
    public List<Towel> getVehicleListService(String shortName) {
        shortName = shortName == null ? "%kh-xe%" : shortName;
        return towelMapper.getVehicleListTowel(shortName);
    }

    @Override
    public Towel getTowel() {
        return null;
    }

    public List<Towel> getList() {
        return null;
    }
}
