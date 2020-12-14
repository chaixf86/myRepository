package com.project.component;

/**
 * 抽象
 * @author chaixf
 *
 */
public interface Component {
	void operation();
}

//叶子节点
interface Left extends Component {
}

//容器组件
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component gitChild(int i);
}
