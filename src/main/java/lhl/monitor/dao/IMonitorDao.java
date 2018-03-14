package lhl.monitor.dao;

import lhl.monitor.model.Monitor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMonitorDao {
    List<Monitor> getMonitors();
}
