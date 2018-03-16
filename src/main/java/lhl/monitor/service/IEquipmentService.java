package lhl.monitor.service;

import lhl.monitor.model.Equipment;

import java.util.List;

public interface IEquipmentService {
    List<Equipment> getEquipmentsByGroupId(String groupId);
}
