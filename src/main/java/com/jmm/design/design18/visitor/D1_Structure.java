package com.jmm.design.design18.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构(Object Structure)-[存放多个东家-可迭代(访客为入参)]角色  : 这里存放 公司、家对象
 */
public class D1_Structure {

    private List<A2_Element> elements = new ArrayList<>();

    public void elementPut(A2_Element element){
        elements.add(element);
    }


    public void elementRemove(A2_Element element){
        elements.remove(element);
    }

    public void accept(A1_Visitor visitor){
        for(A2_Element item : elements){
            item.accept(visitor);
        }
    }
}
