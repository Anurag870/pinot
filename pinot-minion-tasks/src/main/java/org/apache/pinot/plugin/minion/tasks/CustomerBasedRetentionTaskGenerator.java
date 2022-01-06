package org.apache.pinot.plugin.minion.tasks;

import java.util.ArrayList;
import java.util.List;
import org.apache.pinot.core.minion.PinotTaskConfig;
import org.apache.pinot.spi.config.table.TableConfig;

@TaskGenerator
public class CustomerBasedRetentionTaskGenerator implements PinotTaskGenertaor{

  private ClusterInfoAccessor _clusterInfoAccessor;

  @Override
  public void init(ClusterInfoAccessor clusterInfoAccessor) {
    _clusterInfoAccessor = clusterInfoAccessor;
  }

  @Override
  public String getTaskType() {
    return "customerBasedRetentionTask";
  }

  @Override
  public List<PinotTaskConfig> generateTasks(List<TableConfig> tableConfigs) {
    List<PinotTaskConfig> pinotTaskConfigs = new ArrayList<>();
    return pinotTaskConfigs;
  }
}
