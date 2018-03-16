package lhl.monitor.service.impl;

import lhl.monitor.dao.IEquipmentDao;
import lhl.monitor.model.Equipment;
import lhl.monitor.service.IEquipmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EquipmentServiceImpl implements IEquipmentService {
    @Resource
    private IEquipmentDao equipmentDao;

    @Override
    public List<Equipment> getEquipmentsByGroupId(String groupId) {
        return equipmentDao.getEquipmentsByGroupId(groupId);
    }
}
