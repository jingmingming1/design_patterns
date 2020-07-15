package com.jmm.design.design10.command;

/**
 * [命令]
 * 定义一个命令角色 一般是一个接口，
 * 为所有的命令对象声明一个接口，规范将要进行的命令操作。
 */
public interface A2_Command {

        /**
         * 执行命令
         */
        void execute();

        /**
         * 撤销命令
         */
        void undo();
}
