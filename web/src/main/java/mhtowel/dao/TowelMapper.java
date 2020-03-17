package mhtowel.dao;

import mhtowel.dto.Towel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TowelMapper {
    List<Towel> getListTowel();
    List<Towel> getVehicleListTowel(@Param("shortName") String shortName);
}
