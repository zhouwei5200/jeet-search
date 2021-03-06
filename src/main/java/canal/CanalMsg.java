package canal;

import consts.CommonConstant;
import lombok.Data;

import java.util.Map;

/**
 * canal消息
 *
 * @author bug1024
 * @date 2017-03-25
 */
@Data
public class CanalMsg {

    private String key;

    private CanalMsgContent canalMsgContent;

    CanalMsg(CanalMsgContent canalMsgContent) {
        this.key = CommonConstant.CANAL_MSG_KEY_PREFIX + CommonConstant.KEY_SEPARATOR + canalMsgContent.getDbName() + CommonConstant.KEY_SEPARATOR + canalMsgContent.getTableName();
        this.canalMsgContent = canalMsgContent;
    }

    CanalMsg() {
    }

}
