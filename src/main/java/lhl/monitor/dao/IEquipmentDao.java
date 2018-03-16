package lhl.monitor.dao;

import lhl.monitor.model.Equipment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("equipmentDao")
public interface IEquipmentDao {
    List<Equipment> getEquipmentsByGroupId(String groupId);
}
