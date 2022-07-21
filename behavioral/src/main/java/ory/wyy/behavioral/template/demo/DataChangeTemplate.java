package ory.wyy.behavioral.template.demo;

import org.springframework.util.StringUtils;

/**
 * @author Wang Yuanye
 * @version v1.0
 * @apiNote 数据交换模板类 [产品对接]
 * @date : 2021/2/25 下午7:37
 **/
public abstract class DataChangeTemplate {

    /**
     * 流程中必须有的步骤,在父类中定义
     * @param data
     */
    private void checkData(String data){
        if (StringUtils.isEmpty(data)) {
            System.out.println("数据为空");
        }
    }
    /**
     * 处理之前
     * @param data
     * @return
     */
    protected abstract void beforeProcess(String data);

    /**
     * 处理数据
     * @param data
     */
    protected abstract void doProcess(String data);

    /**
     * 处理之后
     * @param data
     */
    protected abstract void afterProcess(String data);

    // 钩子函数,控制执行流程 [抽象类中提供默认流程,子类通过重写钩子方法控制执行流程]

    /**
     * 是否需要预处理[默认需要]
     * @return
     */
    protected boolean needBeforeProcess(){
        return true;
    }

    /**
     * 是否需要后续处理[默认需要]
     * @return
     */
    protected boolean needAfterProcess(){
        return true;
    }

    protected final void dataChangeHandler(String data){
        checkData(data);
        // 默认需要预处理
        if (needBeforeProcess()) {
            this.beforeProcess(data);
        }

        this.doProcess(data);
        // 默认需要后续处理
        if (needAfterProcess()) {
            this.afterProcess(data);
        }

    }
}
